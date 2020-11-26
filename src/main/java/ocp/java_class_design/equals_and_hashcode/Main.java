package ocp.java_class_design.equals_and_hashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Aluno ian = new Aluno(1, "Ian");
        Aluno jorge = new Aluno(2, "Jorge");

        System.out.println(ian.hashCode());
        System.out.println(jorge.hashCode());

        Set<Aluno> alunos = new HashSet<>();
        alunos.add(ian);
        alunos.add(jorge);

        System.out.println("Achou " + alunos.contains(new Aluno(1)));

    }

}
