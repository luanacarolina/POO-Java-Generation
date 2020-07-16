package collections;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {

    public static void main(String[] args) {
        Map<String, Aluno> mapa = new TreeMap<>();

        Aluno a = new Aluno("Luana","Engenharia",9.5);
        Aluno b = new Aluno("Camila","ADS",9.0);
        Aluno c = new Aluno("João","Biologia",6.4);
        Aluno d = new Aluno("Larissa","Letras",10);

        mapa.put("Luana",a);
        mapa.put("Camila",b);
        mapa.put("João",c);
        mapa.put("Larissa",d);
        System.out.println(mapa);
        System.out.println(mapa.get("Luana"));


        Collection<Aluno> alunos = mapa.values();
        for(Aluno e :alunos){
            System.out.println(e);
        }


    }
}
