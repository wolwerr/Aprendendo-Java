package AulaColletion;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("Joao");

        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println("---->>" + nomes);

        nomes.set(2, "Wesley");

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        String nome = nomes.get(3);

        int posicao = nomes.indexOf("Wesley");

        System.out.println(posicao);

        System.out.println(nome);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernado");
        System.out.println(temFernando);

        for (String nomeDoItem: nomes){
            System.out.println("--> " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("----> " + iterator.next());
        }

        nomes.clear();

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);




    }


}



