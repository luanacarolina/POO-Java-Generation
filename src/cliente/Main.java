package cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Luana","123456","Rua 12 ");


        cliente.mostrarDados();
        cliente.possuiDebito(false);
    }
}
