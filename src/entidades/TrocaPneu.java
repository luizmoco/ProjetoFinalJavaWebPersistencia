package entidades;

import id.TrocaPneuID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(TrocaPneuID.class)
public class TrocaPneu {

	@Id private int codBorracharia;
	@Id private int codVeiculo;
	@Id private int codPneu;
	private String data;
	private double valor;

	
	public int getCodBorracharia() {
		return codBorracharia;
	}
	public void setCodBorracharia(int codBorracharia) {
		this.codBorracharia = codBorracharia;
	}
	public int getCodVeiculo() {
		return codVeiculo;
	}
	public void setCodVeiculo(int codVeiculo) {
		this.codVeiculo = codVeiculo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
