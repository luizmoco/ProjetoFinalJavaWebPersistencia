package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Frete {

	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private int codVeiculo;
	private String dataPrevista;
	private int distanciaPrevista;
	private String localDestino;
	private String dataReserva;
	private double valorKm;
	private int kmInicial;
	private int kmFinal;
	private String dataChegada;
	private String dataSaida;
	private String dataPrevistaChegada;
	
	
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
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
	public String getDataPrevista() {
		return dataPrevista;
	}
	public void setDataPrevista(String dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	public int getDistanciaPrevista() {
		return distanciaPrevista;
	}
	public void setDistanciaPrevista(int distanciaPrevista) {
		this.distanciaPrevista = distanciaPrevista;
	}
	public String getLocalDestino() {
		return localDestino;
	}
	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}
	public String getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(String dataReserva) {
		this.dataReserva = dataReserva;
	}
	public double getValorKm() {
		return valorKm;
	}
	public void setValorKm(double valorKm) {
		this.valorKm = valorKm;
	}
	public int getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}
	public int getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
	public String getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(String dataChegada) {
		this.dataChegada = dataChegada;
	}
	public String getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
	public String getDataPrevistaChegada() {
		return dataPrevistaChegada;
	}
	public void setDataPrevistaChegada(String dataPrevistaChegada) {
		this.dataPrevistaChegada = dataPrevistaChegada;
	}

	@ManyToOne
	@JoinColumn(name = "codigo",insertable=false, updatable= false)
	private Veiculo veiculo;
	
	
}
