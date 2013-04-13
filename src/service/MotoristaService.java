package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entidades.Motorista;

public class MotoristaService {
	protected EntityManager em;

	public MotoristaService(EntityManager em) {
		this.em = em;
	}

	public Motorista CreateMotorista(String motorista, String cpf,
			String rg, String cnh, String telefone, String anovencimentocnh,
			String combustivel) {
		Motorista motora = new Motorista();
		motora.setMotorista(motorista);
		motora.setCpf(cpf);
		motora.setRg(rg);
		motora.setCnh(cnh);
		motora.setAnoVencimentoCnh(anovencimentocnh);
		em.persist(motora);
		return motora;
	}

	public Motorista FindMotorista(int id) {
		return em.find(Motorista.class, id);
	}

	public void RemoveMotorista(int id) {
		Motorista motora = FindMotorista(id);
		if (motora != null) {
			em.remove(motora);
		}
	}

	public List<Motorista> findAllDocumento() {
		TypedQuery<Motorista> query = em.createQuery(
				"SELECT e FROM Motorista e", Motorista.class);
		return query.getResultList();
	}
}
