package POO2;

public class Empregado extends Pessoa implements EmpregadoInterface {
    private int codSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome,String endereco,int codSetor,double salarioBase,double imposto){
            super(nome,endereco);
            this.codSetor=codSetor;
            this.salarioBase=salarioBase;
            this.imposto=imposto;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario(){
        double calculo = (this.salarioBase*imposto)/100;
        calculo = this.salarioBase-calculo;
        return calculo;
    }
    public void mostrarDadosEmpregado(){
        System.out.println("Nome: "+getNome());
        System.out.println("Endereço: "+getEndereco());
        System.out.println("Código Setor: "+codSetor);
        System.out.println("Salario Base: "+salarioBase);
        System.out.println("Salario Final: "+calcularSalario());
        System.out.println("Imposto: "+imposto);
    }
}
