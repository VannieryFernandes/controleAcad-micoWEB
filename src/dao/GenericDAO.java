package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class GenericDAO<T extends EntidadeBase> {
	
	public EntityManager getEM() {
		EntityManagerFactory EMFactory = Persistence.createEntityManagerFactory("sistema");
		return EMFactory.createEntityManager();
	}
	
	public T create(T t) throws Exception {
		EntityManager em = getEM();
		try {
			em.getTransaction().begin();
			if(t.getId() == null) {
				em.persist(t);
				em.getTransaction().commit();
			} else {
				throw new Exception("Esse Id consta no BD ou Verifique se ele já foi utilizado e excluído.");	
			}
		} finally {
			em.close();
		}
		return t;
	}
	
	public T read(Class<T> classe, Long id) {
		EntityManager em = getEM();
		T t = null;
		try {
			t = em.find(classe, id);
		} finally {
			em.close();
		}
		return t;
	}
	
	public T update(T t) throws Exception {
		EntityManager em = getEM();
		try {
			em.getTransaction().begin();
			
			if(!em.contains(t)){
				if(em.find(t.getClass(), t.getId()) == null){
					throw new Exception("Erro ao Atualizar. Provavelmente esse Id não existe. Verifique!.");
				} else {
					t = em.merge(t);
				}
				
			}
			em.getTransaction().commit();
			
		} finally {
			em.close();
		}
		return t;
	}
	
	public void delete(Class<T> classe, Long id) {
		EntityManager em = getEM();
		T t = em.find(classe, id);
		try {
			em.getTransaction().begin();
			em.remove(t);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

	public List<T> getLista(String classe)
    {
		EntityManager em = getEM();
        Query query = em.createQuery("SELECT t FROM "+ classe + " t");
        List<T> t = query.getResultList();
        return t;
    }

	public List<T> getPesquisa(String classe, String tipo, String pesquisa)
    {
		EntityManager em = getEM();
        Query query = em.createQuery("SELECT t FROM " + classe + " t WHERE " + tipo + " LIKE '%" + pesquisa + "%'");
        List<T> t = query.getResultList();
        return t;
    }
		
		
	

}
