package id;

import java.io.Serializable;


public class MotoristaFreteID implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codMotorista;
	private int codFrete;
	
	public int getCodMotorista() {
		return codMotorista;
	}
	public int getCodFrete() {
		return codFrete;
	}
	
	public MotoristaFreteID() {	}
	
	public MotoristaFreteID(int codMotor, int codFre){
		this.codFrete = codFre;
		this.codMotorista = codMotor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codFrete;
		result = prime * result + codMotorista;
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
		MotoristaFreteID other = (MotoristaFreteID) obj;
		if (codFrete != other.codFrete)
			return false;
		if (codMotorista != other.codMotorista)
			return false;
		return true;
	}
	
	
}
