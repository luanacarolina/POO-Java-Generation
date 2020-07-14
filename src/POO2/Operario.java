package POO2;

public class Operario extends Pessoa implements EmpregadoInterface {

    private double valorProducao;
    private double comissao;

    public Operario (String nome,String telefone,String endereço,double valorProducao,double comissao){
        super(nome,telefone,endereço);
        this.valorProducao=valorProducao;
        this.comissao=comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    @Override
    public double calcularSalario() {
        double calculo = (this.valorProducao*this.comissao)/100;
        calculo = this.valorProducao+calculo;
        return calculo;
    }
    @Override
    public void mostrarDadosEmpregado() {
        System.out.println("Sistema Operário**************");
        System.out.println("Nome: "+getNome());
        System.out.println("Endereço: "+getEndereco());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Valor Produção "+valorProducao);
        System.out.println("Comissão: "+comissao);
        System.out.println("Salario Final: "+calcularSalario());
    }
}
