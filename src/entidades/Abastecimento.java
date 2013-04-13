package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Abastecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private int codVeiculo;
	private int codMotorista;
	private int valorGasto;
	private int valorLitro;
	private String data;
	private int codPosto;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodVeiculo() {
		return codVeiculo;
	}
	public void setCodVeiculo(int codVeiculo) {
		this.codVeiculo = codVeiculo;
	}
	public int getCodMotorista() {
		return codMotorista;
	}
	public void setCodMotorista(int codMotorista) {
		this.codMotorista = codMotorista;
	}
	public int getValorGasto() {
		return valorGasto;
	}
	public void setValorGasto(int valorGasto) {
		this.valorGasto = valorGasto;
	}
	public int getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(int valorLitro) {
		this.valorLitro = valorLitro;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getCodPosto() {
		return codPosto;
	}
	public void setCodPosto(int codPosto) {
		this.codPosto = codPosto;
	}
	
	
	
}
