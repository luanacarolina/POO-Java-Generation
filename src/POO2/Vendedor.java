package POO2;

public class Vendedor extends Pessoa implements EmpregadoInterface{
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String telefone, double valorVendas,double comissao){
        super(nome,telefone);
        this.valorVendas=valorVendas;
        this.comissao=comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double calculo = (this.valorVendas*comissao)/100;
        calculo = calculo+valorVendas;
        return calculo;
    }

    @Override
    public void mostrarDadosEmpregado() {
        System.out.println("Sistema Vendedor**************");
        System.out.println("Nome: "+getNome());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Valor Vendas "+valorVendas);
        System.out.println("Comissão: "+comissao);
        System.out.println("Salario Final: "+calcularSalario());
    }
}
