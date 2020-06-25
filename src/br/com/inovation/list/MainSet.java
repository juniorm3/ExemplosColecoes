package br.com.inovation.list;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {

    public static void main(String[] args) {
        Set<Integer> numerosSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> numerosLinked = new LinkedHashSet<>();
        TreeSet<Integer> numerosTree = new TreeSet<>();

        /* Preencher Lista */
        prencherLista(numerosSet);
        prencherLista(numerosLinked);
        prencherLista(numerosTree);

        /* Exibir Listas */
        exibirListaSet(numerosSet);
        exibirListaLinked(numerosLinked);
        exibirListaTreeSet(numerosTree);

        numerosSet.remove(3);
        numerosLinked.remove(3);
        numerosTree.pollFirst();

        /* Exibir Listas após remover primeiro item */
        System.out.println(" ");
        exibirListaSet(numerosSet);
        exibirListaLinked(numerosLinked);
        exibirListaTreeSet(numerosTree);

        numerosSet.add(23);
        numerosLinked.add(23);
        numerosTree.add(23);

        /* Exibir Listas após incluir item 23 */
        System.out.println(" ");
        exibirListaSet(numerosSet);
        exibirListaLinked(numerosLinked);
        exibirListaTreeSet(numerosTree);

        /* Exibir tamanho das Listas */
        System.out.println(" ");
        System.out.print(numerosSet.size() + " / ");
        System.out.print(numerosLinked.size() + " / ");
        System.out.print(numerosTree.size());

        /* Verificar se as Listas estão vazias */
        System.out.println(" ");
        System.out.print(numerosSet.isEmpty() + " / ");
        System.out.print(numerosLinked.isEmpty() + " / ");
        System.out.print(numerosTree.isEmpty());

        System.out.println(" ");
        System.out.println(numerosTree);
        System.out.println("First " + numerosTree.first());
        System.out.println("Last " + numerosTree.last());
        System.out.println(numerosTree.lower(44));
        System.out.println(numerosTree.higher(44));

        /* Verifica ierarquia*/

        numerosSet.add(null);
        exibirListaSet(numerosSet);
        //Collections.sort(numerosSet);

    }

    private static void exibirListaTreeSet(TreeSet<Integer> numerosTree) {
        System.out.println("Imprimindo lista TreeSet: " + numerosTree.toString());
        /*for (Integer numero : numerosTree) {
            System.out.println(numero);
        }*/
    }

    private static void exibirListaLinked(LinkedHashSet<Integer> numerosLinked) {
        System.out.println("Imprimindo lista Linked: " + numerosLinked.toString());
        /*for (Integer numero : numerosLinked) {
            System.out.println(numero);
        }*/
    }

    private static void exibirListaSet(Set<Integer> numerosSet) {
        System.out.println("Imprimindo lista Set: " + numerosSet.toString());
        /*for (Integer numero : numerosSet) {
            System.out.println(numero);
        }*/
    }

    private static void prencherLista(Set<Integer> lista) {
        lista.add(3);
        lista.add(88);
        lista.add(20);
        lista.add(44);
        lista.add(3);
    }

    private static void prencherLista(LinkedHashSet<Integer> lista) {
        lista.add(3);
        lista.add(88);
        lista.add(20);
        lista.add(44);
        lista.add(3);
    }
    private static void prencherLista(TreeSet<Integer> lista) {
        lista.add(3);
        lista.add(88);
        lista.add(20);
        lista.add(44);
        lista.add(3);
    }
}
