package POO3.Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome,int idade){
        super(nome,idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    @Override
    public void deveCorrer() {
    System.out.println("Cachorro está correndo");
    }

}
