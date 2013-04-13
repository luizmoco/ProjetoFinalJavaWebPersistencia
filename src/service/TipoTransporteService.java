package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entidades.TipoTransporte;

public class TipoTransporteService {
	protected EntityManager em;

	public TipoTransporteService(EntityManager em) {
		this.em = em;
	}

	public TipoTransporte CreateTipoTransporte(int codigo, String descricao) {
		TipoTransporte tipo = new TipoTransporte();
		tipo.setCodigo(codigo);
		tipo.setDescricao(descricao);
		em.persist(tipo);
		return tipo;
	}

	public TipoTransporte FindTipoTransporte(int id) {
		return em.find(TipoTransporte.class, id);
	}

	public void RemoveTipoTransporte(int id) {
		TipoTransporte tipo = FindTipoTransporte(id);
		if (tipo != null) {
			em.remove(tipo);
		}
	}

	public List<TipoTransporte> findAllDocumento() {
		TypedQuery<TipoTransporte> query = em.createQuery(
				"SELECT e FROM TipoTransporte e", TipoTransporte.class);
		return query.getResultList();
	}
}
