package POO3.Animal;

public class TesteAnimal {
    public static void main(String[] args) {
        System.out.println("Dados cachorro********");
        Cachorro cachorro = new Cachorro("Billy",10);
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getIdade());
        cachorro.deveCorrer();
        cachorro.emitirSom();

        System.out.println("Dados Cavalo**********");
        Cavalo cavalo = new Cavalo("Luciano",6);
        System.out.println(cavalo.getNome());
        System.out.println(cavalo.getIdade());
        cavalo.deveCorrer();
        cavalo.emitirSom();

        System.out.println("Dados Preguiça********");
        Preguica preguica = new Preguica("Preguiça",12);
        System.out.println(preguica.getNome());
        System.out.println(preguica.getIdade());
        preguica.deveCorrer();
        preguica.emitirSom();
        preguica.subirArvores();
    }
}
