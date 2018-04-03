package es.cyc.gr.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USUARIOS database table.
 * 
 */
@Entity
@Table(name="USUARIOS" , schema = "GR")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String login;

	private int estado;

	@Column(name="LAST_APLICATIVO")
	private int lastAplicativo;

	@Column(name="LAST_PERFIL")
	private int lastPerfil;

	@Column(name="LAST_UNIDAD")
	private int lastUnidad;

	private String nombre;

	private String opident;

	private String usuariocics;

	public Usuario() {
		
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getLastAplicativo() {
		return this.lastAplicativo;
	}

	public void setLastAplicativo(int lastAplicativo) {
		this.lastAplicativo = lastAplicativo;
	}

	public int getLastPerfil() {
		return this.lastPerfil;
	}

	public void setLastPerfil(int lastPerfil) {
		this.lastPerfil = lastPerfil;
	}

	public int getLastUnidad() {
		return this.lastUnidad;
	}

	public void setLastUnidad(int lastUnidad) {
		this.lastUnidad = lastUnidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOpident() {
		return this.opident;
	}

	public void setOpident(String opident) {
		this.opident = opident;
	}

	public String getUsuariocics() {
		return this.usuariocics;
	}

	public void setUsuariocics(String usuariocics) {
		this.usuariocics = usuariocics;
	}

	public Usuario(String login, int estado, int lastAplicativo, int lastPerfil, int lastUnidad, String nombre,
			String opident, String usuariocics) {
		super();
		this.login = login;
		this.estado = estado;
		this.lastAplicativo = lastAplicativo;
		this.lastPerfil = lastPerfil;
		this.lastUnidad = lastUnidad;
		this.nombre = nombre;
		this.opident = opident;
		this.usuariocics = usuariocics;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estado;
		result = prime * result + lastAplicativo;
		result = prime * result + lastPerfil;
		result = prime * result + lastUnidad;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((opident == null) ? 0 : opident.hashCode());
		result = prime * result + ((usuariocics == null) ? 0 : usuariocics.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (estado != other.estado)
			return false;
		if (lastAplicativo != other.lastAplicativo)
			return false;
		if (lastPerfil != other.lastPerfil)
			return false;
		if (lastUnidad != other.lastUnidad)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (opident == null) {
			if (other.opident != null)
				return false;
		} else if (!opident.equals(other.opident))
			return false;
		if (usuariocics == null) {
			if (other.usuariocics != null)
				return false;
		} else if (!usuariocics.equals(other.usuariocics))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", estado=" + estado + ", lastAplicativo=" + lastAplicativo + ", lastPerfil="
				+ lastPerfil + ", lastUnidad=" + lastUnidad + ", nombre=" + nombre + ", opident=" + opident
				+ ", usuariocics=" + usuariocics + "]";
	}
	
	

}