package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entidades.Frete;
import entidades.Posto;

public class FreteService {
	
	protected EntityManager em;
	
	public FreteService(EntityManager em){
		this.em = em;
	}
	
	public Frete CreateFrete(int codigo, String descricao, String local, String contato, String telefone) {
		Frete frete = new Frete();
		
		em.persist(frete);
		return frete;
	}
	
	public Posto FindPosto(int id) {
		return em.find(Posto.class, id);
	}

	public void RemovePosto(int id) {
		Posto posto = FindPosto(id);
		if (posto != null) {
			em.remove(posto);
		}
	}
	public List<Posto> FindAllPosto() {
		TypedQuery<Posto> query = em.createQuery("SELECT e FROM Posto e",
				Posto.class);
		return query.getResultList();
	}

}
