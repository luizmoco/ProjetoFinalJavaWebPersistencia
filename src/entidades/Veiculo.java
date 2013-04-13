package entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String modelo;
	private String marca;
	private int codTipo;
	private int codDocumento;
	private String podeViajar;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCodTipo() {
		return codTipo;
	}
	public void setCodTipo(int codTipo) {
		this.codTipo = codTipo;
	}
	public int getCodDocumento() {
		return codDocumento;
	}
	public void setCodDocumento(int codDocumento) {
		this.codDocumento = codDocumento;
	}
	public String getPodeViajar() {
		return podeViajar;
	}
	public void setPodeViajar(String podeViajar) {
		this.podeViajar = podeViajar;
	}

	@OneToMany(mappedBy = "veiculo")
	private List<Frete> fretes;

	public List<Frete> getFretes() {
		return fretes;
	}
	public void setFretes(List<Frete> fretes) {
		this.fretes = fretes;
	}
	
	
	
	
}
