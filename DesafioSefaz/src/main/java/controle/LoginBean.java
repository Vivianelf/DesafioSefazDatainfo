package controle;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

//import org.primefaces.expression.impl.ThisExpressionResolver;
//import javax.faces.application.FacesMessage;

import dao.UsuarioDao;
import dao.UsuarioDaoImpl;
import entidade.Usuario;
import util.JpaUtil;

/**
 * 
 * @author Viviane
 *
 */


@ManagedBean(name = "LoginBean")
@RequestScoped
public class LoginBean {

	private String usuarioAdmin = "admin";
	private String senhaAdmin = "admin";

	private String usuarioTXT;
	private String senhaTXT;
	private UsuarioDao usuarioDao;
	private String mensagem;


	private static final String PESQUISAR = "paginas/pesquisarUsuario.xhtml";

	
	public LoginBean() {
		this.usuarioDao = new UsuarioDaoImpl (JpaUtil.getEntityManager());
	}

	
	  public void entrar() throws IOException {
	 if(this.usuarioTXT.equals(this.usuarioAdmin) && this.senhaTXT.equals(this.senhaAdmin)) {
	  FacesContext.getCurrentInstance().getExternalContext().redirect(PESQUISAR);
	  }else { Usuario usuarioPesquisa = this.usuarioDao.pesquisar(this.usuarioTXT);
		if(usuarioPesquisa != null) {
			if(usuarioPesquisa.getSenha().equals(this.senhaTXT)) {
				FacesContext.getCurrentInstance().getExternalContext().redirect(PESQUISAR);
			}else {
				this.mensagem = "Usuario ou senha errada";
			}
		}else {
			this.mensagem = "Usuario não existe";
		}
		
	}
}

		 
	 

	public String getUsuarioTXT() {
		return usuarioTXT;
	}

	public void setUsuarioTXT(String usuarioTXT) {
		this.usuarioTXT = usuarioTXT;
	}

	public String getSenhaTXT() {
		return senhaTXT;
	}

	public void setSenhaTXT(String senhaTXT) {
		this.senhaTXT = senhaTXT;
	}

	public String getUsuarioAdmin() {
		return usuarioAdmin;
	}

	public void setUsuarioAdmin(String usuarioAdmin) {
		this.usuarioAdmin = usuarioAdmin;
	}

	public String getSenhaAdmin() {
		return senhaAdmin;
	}

	public void setSenhaAdmin(String senhaAdmin) {
		this.senhaAdmin = senhaAdmin;
	}


	public static String getPesquisar() {
		return PESQUISAR;
	}


	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}


	public void usuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	

}
