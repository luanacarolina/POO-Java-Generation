package aviao;

public class Aviao {
    private String marca;
    private int numerosMotor;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int numeroPassageiro;
    private boolean ligado ;

    public Aviao(String marca,int numerosMotor,int velocidadeMaxima,int velocidadeAtual,int numeroPassageiro,boolean ligado){
        this.marca=marca;
        this.numerosMotor=numerosMotor;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
        this.numeroPassageiro=numeroPassageiro;
        this.ligado = ligado;

    }
    public boolean ligadoEDesligado(){
        if(!this.ligado){
            this.ligado=true;
            System.out.println("O Avião está ligado");
        }else {
            this.ligado=false;
            System.out.println("O Aviao esta desligado");
        }
        return this.ligado;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getNumerosMotor() {
        return numerosMotor;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getNumeroPassageiro() {
        return numeroPassageiro;
    }
    public void aumentarVelocidade(int quantidade){
        int velocidadeNova = this.velocidadeAtual+quantidade;
        if(velocidadeNova<velocidadeMaxima){
            this.velocidadeAtual=velocidadeNova;
        }

    }
    public void mostrarDados(){
        System.out.println("Sistema Avião*******");
        System.out.println("Marca: "+marca);
        System.out.println("Numeros motor: "+numerosMotor);
        System.out.println("Velocidade máxima: "+velocidadeMaxima);
        System.out.println("Velocidade Atual: "+velocidadeAtual);
        System.out.println("Numero de passageiros: "+numeroPassageiro);

    }
}
