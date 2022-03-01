
public class Transferencia {
	
	private Integer saldo;
	private String banco;
	private ContaDestino contaDestino;
	private Float valor;
	private String nome;
	
	public Integer getSaldo() {
		return saldo;
	}
	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	
	public ContaDestino getContaDestino() {
		return contaDestino;
	}
	public void setContaDestino(ContaDestino contaDestino) {
		this.contaDestino = contaDestino;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
