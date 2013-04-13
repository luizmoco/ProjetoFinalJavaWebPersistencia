package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Transient;
import javax.persistence.TypedQuery;


public class Service <T> {

	EntityManagerFactory emf;
	EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public Service() {
		emf = Persistence.createEntityManagerFactory("ProjetoFinal");
		em = emf.createEntityManager();
	}
	
	public T find(Class<T> classe ,int id){
		return em.find(classe, id);
	}
	@Transient
	public T create(T obj){
		
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		return obj;
	}
	
	public boolean delete(T obj){
		try {
			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			return false;
		}
		return true;		
	}
	public T update(T obj){
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		return obj;
	}
	
	public List<T> getAll(Class<T> classe){
		TypedQuery<T> query = em.createQuery("select e from "+ classe.getSimpleName() +" e",
				classe);
		return query.getResultList();
	}
}
