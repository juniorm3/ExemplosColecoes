package br.com.inovation.comparator;

import java.util.Comparator;

public class AlunoOrdemInversa implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o2.getAnoNascimento() - o1.getAnoNascimento();
    }
}
