package POO3.Animal;

public class Cavalo extends Animal{

    public Cavalo(String nome , int idade){
        super(nome,idade);
    }

    @Override
    public void emitirSom() {
    System.out.println("Ihhihihihihihih");
    }

    @Override
    public void deveCorrer() {
    System.out.println("Cavalo está correndo");
    }

}
