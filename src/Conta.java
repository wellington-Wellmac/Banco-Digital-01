
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	
	private DadosConta dadosConta;

	private Object cliente;
	
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;	
	}
	
	public DadosConta getDadosConta() {
		return dadosConta;
	}

	public void setDadosConta(DadosConta dadosConta) {
		this.dadosConta = dadosConta;
	}

	@Override
	public void sacar(double valor) {
		saldo -= saldo;
	}
	@Override
	public void depositar(double valor) {
		saldo += saldo;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirinfosComuns() {
		System.out.println(String.format("Titular: %s", ((DadosConta) this.cliente).getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
		

}
