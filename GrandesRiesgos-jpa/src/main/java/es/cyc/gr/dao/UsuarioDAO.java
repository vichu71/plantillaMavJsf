package es.cyc.gr.dao;

import es.cyc.gr.dao.idao.IUsuarioDAO;
import es.cyc.gr.modelo.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("usuarioDao")
@Transactional
public class UsuarioDAO implements IUsuarioDAO {
	
	
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Usuario getUsuario(String usuario) {
		// TODO Apéndice de método generado automáticamente
		Session session = (Session) em.getDelegate();
		Usuario us = new Usuario();
		us = (Usuario) session.get(Usuario.class, usuario);
		return us;
	}
	
	

//	@SuppressWarnings("unchecked")
//	public List<Task> list() {
//		return entityManager.createQuery("select t from Task t")
//				.getResultList();
//	}

}
