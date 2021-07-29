package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //monta a arvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //retorna a primeira capital
        System.out.println(treeCapitais.first());

        //retorna a ultima capital
        System.out.println(treeCapitais.last());
        //retorna a primeira capital abaixo na arvore da capital paramatrizada
        System.out.println(treeCapitais.lower("Florianopolis"));
        //retorna a primeira capital acima na arvore da capital paramatrizada
        System.out.println(treeCapitais.higher("Florianopolis"));
        //exibe todas capitais do console
        System.out.println(treeCapitais);
        // retorna a primeira capital no topo da arvore, removendo do set
        System.out.println(treeCapitais.pollFirst());
        //retorna a ultima capital no final da arvore, removendo do set
        System.out.println(treeCapitais.pollLast());
        //exibe todas capitais no console
        System.out.println(treeCapitais);
        //navega em todos os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String capital: treeCapitais) {
            System.out.println(capital);
        }


    }
}
