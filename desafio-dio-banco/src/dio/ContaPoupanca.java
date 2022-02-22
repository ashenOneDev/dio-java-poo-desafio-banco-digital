package dio;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrado() {
        System.out.println("=== Extrado Conta Corrente ===");
        super.imprimirInfoComuns();
    }

}
