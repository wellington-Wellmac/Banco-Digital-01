
public interface IConta {
	
	void sacar(double valor);
	void depositar(double valor);
	void transferir(Conta contaDestino);
	void transferir(double valor, Conta contaDestino);
	void imprimirExtrato();
	

}
