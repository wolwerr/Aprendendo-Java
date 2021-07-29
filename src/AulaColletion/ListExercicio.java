package AulaColletion;

import java.util.*;
import java.util.stream.Collectors;

public class ListExercicio {
    public static void main(String[] args) {
        List<String> pessoas = new ArrayList<>();

        pessoas.add("Juliana");
        pessoas.add("Pedro");
        pessoas.add("Carlos");
        pessoas.add("Larissa");
        pessoas.add("João");

        for (String nomeDaLista: pessoas){
            System.out.println("-->" + nomeDaLista);
        }
        pessoas.set(2, "Roberto");
        System.out.println(pessoas);

        String nome = pessoas.get(1);
        System.out.println(nome);

        pessoas.remove(4);
        System.out.println(pessoas);

        int tamanho = pessoas.size();
        System.out.println(tamanho);

        boolean temJuliano = pessoas.contains("Juliano");
        System.out.println(temJuliano);

        List pessoas2 = new ArrayList();
        pessoas2.add("Ismael");
        pessoas2.add("Rodrigo");
        pessoas2.add(pessoas);

        System.out.println(pessoas2);
        Collections.sort(pessoas2);



        }

    }

