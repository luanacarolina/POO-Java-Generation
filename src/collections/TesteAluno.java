package collections;

import java.util.HashSet;
import java.util.Set;

public class TesteAluno {

    public static void main(String[] args) {
        Set<Aluno> alunos = new HashSet<Aluno>();
        Aluno a = new Aluno("Luana","Engenharia",9.5);
        Aluno b = new Aluno("Camila","ADS",9.0);
        Aluno c = new Aluno("João","Biologia",6.4);
        Aluno d = new Aluno("Larissa","Letras",10);

        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        alunos.add(d);
        System.out.println(alunos);
    }
}
