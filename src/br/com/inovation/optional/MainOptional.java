package br.com.inovation.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;

public class MainOptional {

    public static void main(String[] args) {
        Optional<String> textoVazio = Optional.empty();
        textoVazio.ifPresentOrElse(System.out::println, () -> System.out.println("Estado Vazio"));


        Optional<String> textoPresente = Optional.of(null);
        textoPresente.ifPresentOrElse(System.out::println, () -> System.out.println("Estado Vazio"));

        Optional<String> textoNull = Optional.ofNullable(null);
        textoNull.ifPresentOrElse(System.out::println, () -> System.out.println("Estado null"));

        System.out.println("--------------------------------");

        verificaConteudo(textoVazio);
        verificaConteudo(textoPresente);
        verificaConteudo(textoNull);

        System.out.println("--------------------------------");

        //verificaEstadoInvalido(textoVazio);
        verificaEstadoInvalido(textoPresente);
        //verificaEstadoInvalido(textoNull);

        System.out.println("--------------------------------");
        //textoPresente = Optional.empty();
        textoPresente.map((valor) -> valor.concat("****")).ifPresent(System.out::println);

        OptionalDouble teste = OptionalDouble.of(25.5);
        System.out.println(teste.isPresent());

    }

    private static void verificaEstadoInvalido(Optional<String> texto) {
        texto.orElseThrow(IllegalStateException::new);
    }

    private static void verificaConteudo(Optional<String> texto) {
        if (texto.isPresent()) {
            String valor = texto.get();

            System.out.println(valor);
        }
    }
}
