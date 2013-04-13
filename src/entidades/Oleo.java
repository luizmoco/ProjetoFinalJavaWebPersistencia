package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Oleo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String dataTroca;
	private String dataPrevisao;
	private String tipoOleo;
	private int codVeiculo;
	private String local;
	private double valor;
	private String kmAtual;
	private String kmPrevisao;
	private int codFuncionario;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDataTroca() {
		return dataTroca;
	}
	public void setDataTroca(String dataTroca) {
		this.dataTroca = dataTroca;
	}
	public String getDataPrevisao() {
		return dataPrevisao;
	}
	public void setDataPrevisao(String dataPrevisao) {
		this.dataPrevisao = dataPrevisao;
	}
	public String getTipoOleo() {
		return tipoOleo;
	}
	public void setTipoOleo(String tipoOleo) {
		this.tipoOleo = tipoOleo;
	}
	public int getCodVeiculo() {
		return codVeiculo;
	}
	public void setCodVeiculo(int codVeiculo) {
		this.codVeiculo = codVeiculo;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getKmAtual() {
		return kmAtual;
	}
	public void setKmAtual(String kmAtual) {
		this.kmAtual = kmAtual;
	}
	public String getKmPrevisao() {
		return kmPrevisao;
	}
	public void setKmPrevisao(String kmPrevisao) {
		this.kmPrevisao = kmPrevisao;
	}
	public int getCodFuncionario() {
		return codFuncionario;
	}
	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}
	
	
	
}
