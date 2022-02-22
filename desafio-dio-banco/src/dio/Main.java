package dio;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Iago");

        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);

	contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);

        contaCorrente.imprimirExtrado();
        contaPoupanca.imprimirExtrado();

    }

}
