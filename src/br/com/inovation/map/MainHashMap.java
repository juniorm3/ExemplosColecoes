package br.com.inovation.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainHashMap {

    public static void main(String[] args) {
        HashMap<String, String> estados = new HashMap<>();
        TreeMap<String, String> estadosTree = new TreeMap<>();

        preencherEstados(estados);
        preencherEstados(estadosTree);

        System.out.println(estados);
        System.out.println(estadosTree);
        estados.remove("MG");
        System.out.println(estados);
        estados.put("DF", "Distrito Federal");
        System.out.println(estados);
        System.out.println("Tamanho do MAP: " + estados.size());
        estados.remove("MS", "Mato Grosso do Sul");
        System.out.println(estados);

        for (String estado : estados.keySet()) {
            System.out.println("Nome: " + estado);
        }

        //estados.remove("SC");
        System.out.println("O hasmap contem Santa Catarina? " + estados.containsKey("SC"));

        System.out.println("O Estado do Maranhão esta no hash? " + estados.containsValue("Maranhão"));

        System.out.println(estadosTree.lastEntry());
        System.out.println(estadosTree.firstEntry());
        System.out.println(estados.get(3));



    }

    private static void preencherEstados(Map<String, String> estados) {
        estados.put("TO", "Tocantins");
        estados.put("AC", "Acre");
        estados.put("SE", "Sergipe");
        estados.put("AL", "Alagoas");
        estados.put("SP", "São Paulo");
        estados.put("AP", "Amapá");
        estados.put("SC", "Santa Catarina");
        estados.put("AM", "Amazonas");
        estados.put("RR", "Roraima");
        estados.put("BA", "Bahia");
        estados.put("RO", "Rondônia");
        estados.put("CE", "Ceará");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("ES", "Espírito Santo");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("GO", "Goiás");
        estados.put("PI", "Piauí");
        estados.put("MA", "Maranhão");
        estados.put("PE", "Pernambuco");
        estados.put("MT", "Mato Grosso");
        estados.put("PR", "Paraná");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("PB", "Paraíba");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Pará");
    }
}
