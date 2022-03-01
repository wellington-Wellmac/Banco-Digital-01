
public class DadosConta {
	
	private String nome;
	private String cpf;
	private Integer senha;
	private ContaCorrente contaCorrente;
	private String extrato;
	private Pagamentos pagamentos;
	private Pix pix;
	private Cartao cartao;
	private Transferencia transferencia;
	private Cliente cliente;
	
	
	public String getNome() {
		return nome;
	}
	public Integer getSenha() {
		return senha;
	}
	public void setSenha(Integer senha) {
		this.senha = senha;
	}
	public Cartao getCartao() {
		return cartao;
	}
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
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
	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	public Pagamentos getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(Pagamentos pagamentos) {
		this.pagamentos = pagamentos;
	}
	public Pix getPix() {
		return pix;
	}
	public void setPix(Pix pix) {
		this.pix = pix;
	}
	public Transferencia getTransferencia() {
		return transferencia;
	}
	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}
	public String getExtrato() {
		return extrato;
	}
	public void setExtrato(String extrato) {
		this.extrato = extrato;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
