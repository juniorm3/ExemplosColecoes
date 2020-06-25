package br.com.inovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainList {

    public static void main(String[] args) {
        List<String> primeiraLista = new ArrayList<String>();
        preencherLista(primeiraLista);

        for(String valor : primeiraLista){
            System.out.println(valor);
        }
        System.out.println("--------------");

        System.out.println(primeiraLista);
        primeiraLista.set(2, "Roberto");
        System.out.println(primeiraLista);

        System.out.println("--------------");
        System.out.println("Remover indice 4");
        primeiraLista.remove(4);
        System.out.println(primeiraLista);
        System.out.println("--------------");
        primeiraLista.clear();
        preencherLista(primeiraLista);
        System.out.println("Remover nome João");
        System.out.println(primeiraLista);
        primeiraLista.remove("João");
        System.out.println(primeiraLista);

        System.out.println("--------------");
        System.out.println("Retorna lista");
        primeiraLista.clear();
        preencherLista(primeiraLista);
        System.out.println(primeiraLista);

        System.out.println("--------------");
        System.out.println("Juliano na lista? " + primeiraLista.contains("Juliano"));

        System.out.println("--------------");
        System.out.println("Criar nova lista");
        List<String> novaLista = new ArrayList<>();
        novaLista.add("Ismael");
        novaLista.add("Rodrigo");
        System.out.println(novaLista);

        System.out.println("--------------");
        System.out.println("Composição das duas listas");
        primeiraLista.addAll(novaLista);
        System.out.println(primeiraLista);

        System.out.println("--------------");
        System.out.println("Ordenando listas");
        Collections.sort(primeiraLista);
        System.out.println(primeiraLista);
        primeiraLista.add("Carlos");

        System.out.println("A lista esta vazia ? " + primeiraLista.isEmpty());


    }

    private static void preencherLista(List<String> exercicio) {
        exercicio.add("Juliana");
        exercicio.add("Pedro");
        exercicio.add("Carlos");
        exercicio.add("Larissa");
        exercicio.add("João");
    }


}
