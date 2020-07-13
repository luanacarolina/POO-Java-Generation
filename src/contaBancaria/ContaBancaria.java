package contaBancaria;

public class ContaBancaria {
    private String nomeCliente;
    private String agencia;
    private double saldo;
    private double limite;

    public ContaBancaria(String nomeCliente,String agencia,double saldo,double limite){
        this.nomeCliente=nomeCliente;
        this.agencia=agencia;
        this.limite=limite;
        this.saldo=saldo;
    }

    public double sacar(double valor){
        if(this.saldo>=valor){
            double saque =this.saldo-valor;
            this.saldo = saque;
            System.out.println("O valor do saque foi de R$ "+valor);
        }else{
            System.out.println("Valor de saque maior que o  saldo disponivel na conta");
        }
        return this.saldo;
    }
    public double deposita(double valor){
        double deposito = this.saldo+valor;
        this.saldo = deposito;
        return this.saldo;
    }

    public void mostrarDados(){
        System.out.println("Conta Bancaria********");
        System.out.println("Nome Cliente: "+nomeCliente);
        System.out.println("Agência: "+agencia);
        System.out.println("Saldo: "+saldo);
        System.out.println("Limite: "+limite);
    }

}
