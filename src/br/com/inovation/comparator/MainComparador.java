package br.com.inovation.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComparador {

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        preenCherAlunos(alunos);

        System.out.println("<<< Ordem de inserção >>>");
        System.out.println(alunos);

        alunos.sort(Comparator.comparingInt(Aluno::getIdade).reversed());


        alunos.sort((first, second) -> first.getAnoNascimento() - second.getAnoNascimento());
        System.out.println("<<< Ordem natural dos anos >>>");
        System.out.println(alunos);

        alunos.sort((first, second) -> second.getAnoNascimento() - first.getAnoNascimento());
        System.out.println("<<< Ordem inversa dos anos >>>");
        System.out.println(alunos);

        alunos.sort(Aluno::compareTo);
        System.out.println("<<< Ordem Natural dos anos >>>");
        System.out.println(alunos);

        Collections.sort(alunos);
        System.out.println("<<< Usando interfasse comparable >>>");
        System.out.println(alunos);

        Collections.sort(alunos, new AlunoOrdemInversa());
        System.out.println("<<< Usando classe que implemta comparator >>>");
        System.out.println(alunos);

    }

    private static void preenCherAlunos(List<Aluno> alunos) {
        Aluno aluno1 = new Aluno(1, "Mario", 43, 'M', 1977);
        alunos.add(aluno1);
        Aluno aluno2 = new Aluno(2, "Andreia", 43, 'F', 1976);
        alunos.add(aluno2);
        Aluno aluno3 = new Aluno(3, "Milena", 21, 'F', 1998);
        alunos.add(aluno3);
        Aluno aluno4 = new Aluno(4, "Rafaela", 16, 'F', 2003);
        alunos.add(aluno4);
        Aluno aluno5 = new Aluno(5, "Luciana", 46, 'F', 1974);
        alunos.add(aluno5);
        Aluno aluno6 = new Aluno(6, "Renata", 45, 'F', 1975);
        alunos.add(aluno6);
        Aluno aluno7 = new Aluno(7, "Marcio", 42, 'M', 1978);
        alunos.add(aluno7);
        Aluno aluno8 = new Aluno(8, "Juliana", 39, 'F', 1981);
        alunos.add(aluno8);
        Aluno aluno9 = new Aluno(9, "Mario", 68, 'M', 1952);
        alunos.add(aluno9);
        Aluno aluno10 = new Aluno(10, "Gloria", 64, 'F', 1956);
        alunos.add(aluno10);

    }
}
