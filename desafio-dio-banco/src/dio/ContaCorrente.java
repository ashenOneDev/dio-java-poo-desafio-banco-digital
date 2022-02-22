package dio;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrado() {
        System.out.println("=== Extrado Conta Corrente ===");
        super.imprimirInfoComuns();
    }



}
