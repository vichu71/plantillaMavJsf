package es.cyc.gr.negocio;


//import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.cyc.gr.dao.idao.IUsuarioDAO;
import es.cyc.gr.modelo.Usuario;
import es.cyc.gr.negocio.inegocio.IUsuarioNegocio;

@Component("usuarioNegocio")
public class UsuarioNegocio implements IUsuarioNegocio{
	
	@Resource(name="usuarioDao")
	IUsuarioDAO usuariodao;

	@Override
	public Usuario getUsuario(String usuario) {
		Usuario us = new Usuario();
		try {
			us = usuariodao.getUsuario(usuario);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		return us;
	}

}
