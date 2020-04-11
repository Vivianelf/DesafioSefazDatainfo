package entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Viviane
 *
 */

//Faz com que o JPAsaiba que aquela classe deve ser manipulada por ele
@Entity
//Define que esta classe possui uma tabela chamada USUARIO no banco de dados
@Table(name = "usuario")
public class Usuario {
	
	//Chave primaria
	@Id
	// Coluna correspondente no banco de dados
	@Column(name="email")
	private String email;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="senha")
	private String senha;
	
	
	//Se o relacionamento termina com ToMany, ent�o voc� tem uma lista de entidades relacionadas.
	@OneToMany(mappedBy="usuario", cascade= CascadeType.ALL) 
	private List<Telefone> telefones;


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public List<Telefone> getTelefones() {
		return telefones;
	}


	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	


	
	
	
}
