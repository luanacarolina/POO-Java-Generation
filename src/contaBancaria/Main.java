package contaBancaria;

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Luana","12345-x",100,1000);
        conta.deposita(50);
        conta.mostrarDados();
        conta.sacar(100);
        conta.mostrarDados();
    }
}
