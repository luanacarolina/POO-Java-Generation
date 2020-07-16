package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
    public static void main(String[] args) {
        String nome[]={"Luis","Lucas","Mario","Maria","Luis"};
        Set<String> set = new HashSet<String>();

        try {
            for(int i =0;i<5;i++){
                set.add(nome[i]);
            }
            System.out.println(set);

            TreeSet listaOrdenada = new TreeSet<String>(set);
            System.out.println("A lista ordenada é:");
            System.out.println(listaOrdenada);

            System.out.println("The First element of the set is: "+(String)listaOrdenada.first());
            System.out.println("The last element of the set is: "+(String)listaOrdenada.last());
        }catch (Exception e){

        }
    }
}
