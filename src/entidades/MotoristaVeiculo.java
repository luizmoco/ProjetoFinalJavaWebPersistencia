package entidades;

import id.MotoristaVeiculoID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(MotoristaVeiculoID.class)
public class MotoristaVeiculo {

	@Id private int codMotorista;
	@Id private int codVeiculo;
	
	public int getCodMotorista() {
		return codMotorista;
	}
	public void setCodMotorista(int codMotorista) {
		this.codMotorista = codMotorista;
	}
	public int getCodVeiculo() {
		return codVeiculo;
	}
	public void setCodVeiculo(int codVeiculo) {
		this.codVeiculo = codVeiculo;
	}
	
	
	
}
