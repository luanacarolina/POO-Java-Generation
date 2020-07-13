package funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Luana","Eletrica",200,"12345");
        funcionario.bonus();
        funcionario.mostrarDados();
        System.out.println("**************************************");
        Funcionario funcionario2 = new Funcionario("Ana","Ti",1200,"12345");
        funcionario2.bonus();
        funcionario2.mostrarDados();

    }
}
