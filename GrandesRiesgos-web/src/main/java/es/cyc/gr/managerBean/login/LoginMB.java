package es.cyc.gr.managerBean.login;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import es.cyc.gr.dao.idao.IUsuarioDAO;
import es.cyc.gr.modelo.Usuario;
import es.cyc.gr.negocio.inegocio.IUsuarioNegocio;

@Component("login")
@Scope("request")
public class LoginMB {
	
	private String usuario;
	private String pass;
	
	
	@Resource(name="usuarioNegocio")
	IUsuarioNegocio usuarionegocio;
	
	public IUsuarioNegocio getUsuarionegocio() {
		return usuarionegocio;
	}
	public void setUsuarionegocio(IUsuarioNegocio usuarionegocio) {
		this.usuarionegocio = usuarionegocio;
	}
	
	Usuario usuarioLogado;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		System.out.println(usuario);
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String validar(){
		
		
		String target = "";
		usuarioLogado = getUsuarionegocio().getUsuario(usuario);
		
		if(usuarioLogado!=null)target="ok";
		
		return target;
	}
	
	
	

}
