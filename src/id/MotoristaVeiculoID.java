package id;

import java.io.Serializable;

public class MotoristaVeiculoID implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codVeiculo;
	private int codMotorista;
	
	public MotoristaVeiculoID() {
		// TODO Auto-generated constructor stub
	}
	
	public MotoristaVeiculoID(int codVei, int codMotor){
		this.codVeiculo = codVei;
		this.codMotorista = codMotor;
	}
	
	
	public int getCodVeiculo() {
		return codVeiculo;
	}
	public int getCodMotorista() {
		return codMotorista;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codMotorista;
		result = prime * result + codVeiculo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MotoristaVeiculoID other = (MotoristaVeiculoID) obj;
		if (codMotorista != other.codMotorista)
			return false;
		if (codVeiculo != other.codVeiculo)
			return false;
		return true;
	}
	
	
	
	
}
