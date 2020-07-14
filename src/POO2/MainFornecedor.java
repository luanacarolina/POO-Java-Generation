package POO2;

public class MainFornecedor {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("Luana","Rua 3",1000,300);
        fornecedor.mostrarDados();
        System.out.println(fornecedor.obterSaldo());
    }
}
