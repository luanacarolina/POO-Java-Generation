package POO2;

public class Main {
    public static void main(String[] args) {
        Pessoa1 luana = new Pessoa1();
        luana.setNome("Luana");
        luana.setEndereco("Rua 3");
        luana.setTelefone("1133567899");
        luana.mostrarDados();

        System.out.println();

        Pessoa gabriela = new Pessoa1("Gabriela","Rua 3");
        gabriela.mostrarDados();

        System.out.println();

        Pessoa kaciany = new Pessoa1("Kaciany","Rua 4","1199768956");
       System.out.println(kaciany.getTelefone());
       kaciany.mostrarDados();
    }
}
