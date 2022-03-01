import java.sql.Date;

public class AberturaConta {
	
	private String nome;
	private String cpf;
	private Date dataAbertura;
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFotoDocumento() {
		return fotoDocumento;
	}
	public void setFotoDocumento(String fotoDocumento) {
		this.fotoDocumento = fotoDocumento;
	}
	public String getFotoComDocumento() {
		return fotoComDocumento;
	}
	public void setFotoComDocumento(String fotoComDocumento) {
		this.fotoComDocumento = fotoComDocumento;
	}
	private String fotoDocumento;
	private String fotoComDocumento;

}
