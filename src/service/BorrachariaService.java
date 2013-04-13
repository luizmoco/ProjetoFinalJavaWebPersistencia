package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entidades.Borracharia;

public class BorrachariaService {

	protected EntityManager em;

	public BorrachariaService(EntityManager em) {
		this.em = em;
	}

	public Borracharia createborracharia(int codigo, String descricao, String local, String contato, String telefone) {
		Borracharia borracharia = new Borracharia();
		borracharia.setCodigo(codigo);
		borracharia.setContato(contato);
		borracharia.setDescricao(descricao);
		borracharia.setLocal(local);
		borracharia.setTelefone(telefone);
		em.persist(borracharia);
		return borracharia;
	}

	public void removeBorracharia(int id) {
		Borracharia borracharia = findBorracharia(id);
		if (borracharia != null) {
			em.remove(borracharia);
		}
	}

	public Borracharia findBorracharia(int id) {
		return em.find(Borracharia.class, id);
	}

	public List<Borracharia> findAllBorracharia() {
		TypedQuery<Borracharia> query = em.createQuery("SELECT e FROM Borracharia e",
				Borracharia.class);
		return query.getResultList();
	}
}
