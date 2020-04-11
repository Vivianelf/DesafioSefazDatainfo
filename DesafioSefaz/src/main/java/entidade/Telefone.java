package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Viviane
 *
 */

@Entity
@Table(name = "telefone")
public class Telefone {

	@Id
	@Column(name = "id")

    private long id;
	
	@Column(name = "ddd")
	private int ddd;

	@Column(name = "numero")
	private String numero;

	@Column(name = "tipo")
	private String tipo;

	 //Se termina com ToOne, só há uma única entidade relacionada.
	@ManyToOne
	@JoinColumn(name = "email_usuario", referencedColumnName = "email", nullable = false)
	private Usuario usuario;

	public Telefone() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	}

	

