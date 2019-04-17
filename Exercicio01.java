package br.com.digitalhouse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Exercicio01 {

    public static void main(String[] args) {


        Map<Integer, String> dicionarioSonhos = new HashMap<>();

        dicionarioSonhos.put(0, "OVOS");
        dicionarioSonhos.put(1, "ÁGUA");
        dicionarioSonhos.put(2, "ESCOPETA");
        dicionarioSonhos.put(3, "CAVALO");
        dicionarioSonhos.put(4, "DENTISTA");
        dicionarioSonhos.put(5, "FOGO");

        System.out.println(dicionarioSonhos.get(3));


        Map<String, List<String>> dicionarioApelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder Woman");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");

        List<String> apelidosLucas = new ArrayList<>();
        apelidosLucas.add("Lukinha");
        apelidosLucas.add("Jorge");
        apelidosLucas.add("George");

        dicionarioApelidos.put("João", apelidosJoao);
        dicionarioApelidos.put("Miguel", apelidosMiguel);
        dicionarioApelidos.put("Maria", apelidosMaria);
        dicionarioApelidos.put("Lucas", apelidosLucas);


        System.out.println("Apelidos do Miguel: \n" + dicionarioApelidos.get("Lucas"));

    }


}

