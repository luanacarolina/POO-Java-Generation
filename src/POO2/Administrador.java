package POO2;

public class Administrador extends Pessoa {
    private double ajudaViagens;
    private double ajudaEstadia;

    public Administrador(String nome,String telefone,String endereco,double ajudaEstadia,double ajudaViagens){
        super(nome,endereco,telefone);
        this.ajudaEstadia=ajudaEstadia;
        this.ajudaViagens=ajudaViagens;
    }

    public double getAjudaViagens() {
        return ajudaViagens;
    }

    public void setAjudaViagens(double ajudaViagens) {
        this.ajudaViagens = ajudaViagens;
    }

    public double getAjudaEstadia() {
        return ajudaEstadia;
    }

    public void setAjudaEstadia(double ajudaEstadia) {
        this.ajudaEstadia = ajudaEstadia;
    }
    public void mostrarDadosEmpregado(){
        System.out.println("Nome: "+getNome());
        System.out.println("Endereço: "+getEndereco());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Ajuda Estadia "+ajudaEstadia);
        System.out.println("Ajuda Viagens "+ajudaViagens);

    }
}
