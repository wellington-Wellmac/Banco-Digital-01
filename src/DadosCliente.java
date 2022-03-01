import java.sql.Date;


public class DadosCliente {
	
	private String nome;
	private String cpf;
	private String rg;
	private Date dataNascimento;
	private String celular;
	private String sexo;
	private String estadoCivil;
	private String email;
	private Endereco endereco;
	private DadosTrabalho dadosTrabalho;
	private Contrato contratoAssinado;

	
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public DadosTrabalho getDadosTrabalho() {
		return dadosTrabalho;
	}
	public void setDadosTrabalho(DadosTrabalho dadosTrabalho) {
		this.dadosTrabalho = dadosTrabalho;
	}
	public Contrato getContratoAssinado() {
		return contratoAssinado;
	}
	public void setContratoAssinado(Contrato contratoAssinado) {
		this.contratoAssinado = contratoAssinado;
	}
	
}
