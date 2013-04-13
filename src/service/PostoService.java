package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entidades.Posto;

public class PostoService {
	
	protected EntityManager em;
	
	public PostoService(EntityManager em){
		this.em = em;
	}
	
	public Posto CreatePosto(int codigo, String descricao, String local, String contato, String telefone) {
		Posto posto = new Posto();
		posto.setCodigo(codigo);
		posto.setContato(contato);
		posto.setTelefone(telefone);
		em.persist(posto);
		return posto;
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
