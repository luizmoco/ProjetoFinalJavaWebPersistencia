package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Motorista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinTable(name = "stock_category", catalog = "mkyongdb", joinColumns = { 
//			@JoinColumn(name = "STOCK_ID", nullable = false, updatable = false) }, 
//			inverseJoinColumns = { @JoinColumn(name = "CATEGORY_ID", 
//					nullable = false, updatable = false) })
	
	/*@ManyToMany 
	@JoinTable(name = "motoristafrete", joinColumns={@JoinColumn(name="codMotorista")},
			inverseJoinColumns={@JoinColumn(name="codFrete")})*/
	//private Collection<Frete> frete;
	
	private String motorista;
	private String cpf;
	private String rg;
	private String cnh;
	private String telefone;
	private String anoVencimentoCnh;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMotorista() {
		return motorista;
	}
	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getAnoVencimentoCnh() {
		return anoVencimentoCnh;
	}
	public void setAnoVencimentoCnh(String anoVencimentoCnh) {
		this.anoVencimentoCnh = anoVencimentoCnh;
	}
	
}
