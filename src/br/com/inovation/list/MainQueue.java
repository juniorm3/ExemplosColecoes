package br.com.inovation.list;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("--------------------------");
        System.out.println("Retorna primeiro elemento sem removelo:");
        System.out.println(nomes.peek());
        System.out.println("--------------------------");
        System.out.println("Retorna primeiro elemento removendo da lista:");
        System.out.println(nomes.poll());
        System.out.println(nomes);
        System.out.println("--------------------------");
        System.out.println("Adicona novo elemento na fila");
        nomes.add("Daniel");
        System.out.println(nomes);
        System.out.println("--------------------------");
        System.out.println("Tamanho da fila");
        System.out.println(nomes.size());
        System.out.println("--------------------------");
        System.out.println("A fila esta vazia ? " + nomes.isEmpty());
        System.out.println("--------------------------");
        System.out.println("Carlos esta na lista ? " + nomes.contains("Carlos"));
        System.out.println(nomes);
        nomes.peek();
        System.out.println(nomes);
    }

}
