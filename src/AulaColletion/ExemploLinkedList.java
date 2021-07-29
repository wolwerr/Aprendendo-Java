package AulaColletion;

import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

       // filaBanco.clear();

        String primeiroCLiente = filaBanco.peek();

        System.out.println(primeiroCLiente);

        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element();

        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);

        for (String cliente: filaBanco){
            System.out.println(cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) {
            System.out.println("--->" + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        filaBanco.clear();
        System.out.println(filaBanco.isEmpty());


    }
}
