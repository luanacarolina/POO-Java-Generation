package aviao;

public class Main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao("Airbus",12,100,20,12,true);

        aviao.ligadoEDesligado();
        aviao.ligadoEDesligado();
        aviao.aumentarVelocidade(50);
        aviao.mostrarDados();



    }
}
