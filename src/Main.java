
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Andre");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.pedirEmprestimo(1000);
		cc.depositar(100);
		cc.transferir(100, poupanca);

		poupanca.pedirEmprestimo(500);
		poupanca.depositar(50);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
