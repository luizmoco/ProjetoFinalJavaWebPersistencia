package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entidades.Documento;

public class DocumentoService {
	protected EntityManager em;

	public DocumentoService(EntityManager em) {
		this.em = em;
	}

	public Documento createborracharia(int codigo, String placa, String chassi,
			String cor, int capacidade, float capacidadeCarga, int potencia,
			String combustivel) {
		Documento doc = new Documento();
		doc.setCodigo(codigo);
		doc.setPlaca(placa);
		doc.setChassi(chassi);
		doc.setCor(cor);
		doc.setCapacidade(capacidade);
		doc.setCapacidadeCarga(capacidadeCarga);
		doc.setPotencia(potencia);
		doc.setCombustivel(combustivel);
		em.persist(doc);
		return doc;
	}

	public Documento FindDocumento(int id) {
		return em.find(Documento.class, id);
	}

	public void RemoveDocumento(int id) {
		Documento doc = FindDocumento(id);
		if (doc != null) {
			em.remove(doc);
		}
	}

	public List<Documento> findAllDocumento() {
		TypedQuery<Documento> query = em.createQuery(
				"SELECT e FROM Documento e", Documento.class);
		return query.getResultList();
	}
}
