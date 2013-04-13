package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entidades.Pneu;
import entidades.Posto;

public class PneuService {
	protected EntityManager em;

	public PneuService(EntityManager em) {
		this.em = em;
	}

	public Pneu CreatePneu(int codigo, int aro, int banda, int largura,
			String modelo, String marca) {
		Pneu pneu = new Pneu();
		pneu.setCodigo(codigo);
		pneu.setAro(aro);
		pneu.setBanda(banda);
		pneu.setModelo(modelo);
		pneu.setMarca(marca);
		em.persist(pneu);
		return pneu;
	}

	public Pneu FindPneu(int id) {
		return em.find(Pneu.class, id);
	}

	public java.util.List<Pneu> findAllPneu() {
		TypedQuery<Pneu> query = em.createQuery("select e from Pneu e",
				Pneu.class);
		return query.getResultList();
	}

	public void RemorePneu(int id) {
		Pneu pneu = em.find(Pneu.class, id);
		if (pneu != null) {
			em.remove(pneu);
		}
	}

	public List<Posto> FindAllPosto() {
		TypedQuery<Posto> query = em.createQuery("SELECT e FROM Posto e",
				Posto.class);
		return query.getResultList();
	}
}
