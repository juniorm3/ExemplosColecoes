package br.com.inovation.comparator;

import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainComparatorMap {

    public static void main(String[] args) {
        TreeSet<Aluno> alunos = new TreeSet<>();
        TreeMap<Integer, Aluno> alunos2 = new TreeMap<>();

        preenCherAlunos2(alunos2);
        preenCherAlunos(alunos);

        System.out.println("<<< Ordem de inserção >>>");
        System.out.println(alunos);
        System.out.println(alunos2);

    }

    private static void preenCherAlunos2(TreeMap<Integer, Aluno> alunos) {
        Aluno aluno1 = new Aluno(1, "Mario", 43, 'M', 1977);
        alunos.put(aluno1.getAnoNascimento(), aluno1);
        Aluno aluno2 = new Aluno(2, "Andreia", 43, 'F', 1976);
        alunos.put(aluno2.getAnoNascimento(), aluno2);
        Aluno aluno3 = new Aluno(3, "Milena", 21, 'F', 1998);
        alunos.put(aluno3.getAnoNascimento(), aluno3);
        Aluno aluno4 = new Aluno(4, "Rafaela", 16, 'F', 2003);
        alunos.put(aluno4.getAnoNascimento(), aluno4);
        Aluno aluno5 = new Aluno(5, "Luciana", 46, 'F', 1974);
        alunos.put(aluno5.getAnoNascimento(), aluno5);
        Aluno aluno6 = new Aluno(6, "Renata", 45, 'F', 1975);
        alunos.put(aluno6.getAnoNascimento(), aluno6);
        Aluno aluno7 = new Aluno(7, "Marcio", 42, 'M', 1978);
        alunos.put(aluno7.getAnoNascimento(), aluno7);
        Aluno aluno8 = new Aluno(8, "Juliana", 39, 'F', 1981);
        alunos.put(aluno8.getAnoNascimento(), aluno8);
        Aluno aluno9 = new Aluno(9, "Mario", 68, 'M', 1952);
        alunos.put(aluno9.getAnoNascimento(), aluno9);
        Aluno aluno10 = new Aluno(10, "Gloria", 64, 'F', 1956);
        alunos.put(aluno10.getAnoNascimento(), aluno10);
    }

    private static void preenCherAlunos(TreeSet<Aluno> alunos) {
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
