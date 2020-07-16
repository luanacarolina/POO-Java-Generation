package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

    public static void main(String[] args) {
        Collection<String> nomes = new ArrayList<>();
        nomes.add("Luana");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Rafaela");

        System.out.println("Lista de nomes: "+nomes);
        //nomes.clear();
        System.out.println("Lista de nomes: "+nomes);
        //nomes.remove("Maria");

        if(nomes.isEmpty()){
            System.out.println("Lista Vazia");
        }else {
            System.out.println("Lista de nomes: "+nomes);
        }

        System.out.println("Contém o nome Luana? "+nomes.contains("Luana"));
        System.out.println("Lista de nomes: "+nomes);

        Collection<String> nomes2 = Arrays.asList("Carla","Augusto");
        System.out.println("Lista de nomes2: "+nomes2);

        nomes.addAll(nomes2);
        System.out.println("Lista de nomes: "+nomes);

        for(String names:nomes){
            System.out.println("Lista de nomes: "+names);
        }

    }


}
