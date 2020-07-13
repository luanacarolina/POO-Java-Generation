package funcionario;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String documento;


    public Funcionario(String nome,String departamento,double salario,String documento){
        this.nome=nome;
        this.departamento=departamento;
        this.salario=salario;
        this.documento = documento;

    }

    public void  bonus(){
        if (this.departamento == "Administração") {
            this.salario +=200;
        }else if(this.departamento.equalsIgnoreCase("TI")){
            this.salario+=300;
        }else {
            System.out.println("Funcionario não está elegivel para bonus");
        }
    }
    public void mostrarDados(){
        System.out.println("Sistema funcionario*****");
        System.out.println("Nome: "+nome);
        System.out.println("Departamento: "+departamento);
        System.out.println("Salario: "+salario);
        System.out.println("Documento: "+documento);
        bonus();
    }

}
