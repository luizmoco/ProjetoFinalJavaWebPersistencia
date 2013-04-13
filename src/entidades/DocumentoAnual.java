package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DocumentoAnual {

	@Id
	@GeneratedValue
	private int codigo;
	private int codDocumento;
	private String anoExercicio;
	private double valorPrevisto;
	private double valorPago;
	private String dataPagamento;
	private String documentoPago;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getcodDocumento() {
		return codDocumento;
	}
	public void setcodDocumento(int codDocumento) {
		this.codDocumento = codDocumento;
	}
	public String getAnoExercicio() {
		return anoExercicio;
	}
	public void setAnoExercicio(String anoExercicio) {
		this.anoExercicio = anoExercicio;
	}
	public double getValorPrevisto() {
		return valorPrevisto;
	}
	public void setValorPrevisto(double valorPrevisto) {
		this.valorPrevisto = valorPrevisto;
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	public String getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public String getDocumentoPago() {
		return documentoPago;
	}
	public void setDocumentoPago(String documentoPago) {
		this.documentoPago = documentoPago;
	}
	
	
	
}
