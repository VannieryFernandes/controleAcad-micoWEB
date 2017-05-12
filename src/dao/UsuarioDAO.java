package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario> {
	
	public Usuario efetuarLogin(String username, String password){
		
		EntityManager em = getEM();
		Query query = em.createQuery("select u from Usuario u where u.nome = :username and u.senha = :password");
		
		query.setParameter("username", username);
		query.setParameter("password", password);
		
		List<Usuario> usuario = query.getResultList();
		
		if(usuario.isEmpty()) {
			return null;
		} else {
			return usuario.get(0);
		}
	}

}
