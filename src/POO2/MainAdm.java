package POO2;

public class MainAdm {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Gabriela","119898989","Rua 10",1000,2000);
        administrador.mostrarDadosEmpregado();
        System.out.println("Valor Ajuda Estadia: "+administrador.getAjudaEstadia());

    }
}
