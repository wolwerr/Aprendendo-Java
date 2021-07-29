package AulaColletion;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquetebool");
        esportes.add("Tênis de mesa");
        esportes.add("Handebol");

        System.out.println(esportes);

        esportes.set(2, "Ping Pong");
        esportes.remove(2);
        esportes.remove("Handebol");

        System.out.println(esportes);

        System.out.println(esportes.get(0));

        for (String esporte: esportes) {
            System.out.println(esporte);
        }

    }
}
