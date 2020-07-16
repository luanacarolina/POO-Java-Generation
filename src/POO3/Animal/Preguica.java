package POO3.Animal;

public class Preguica extends Animal {

    public Preguica(String nome , int idade){
        super(nome,idade);
    }

    @Override
    public void emitirSom() {
    System.out.println("Emite som de preguiça");
    }

    @Override
    public void deveCorrer() {
    System.out.println("Preguiça está andando");
    }

    public void subirArvores(){
        System.out.println("Preguiça está subindo em uma arvore!!");
    }
}
