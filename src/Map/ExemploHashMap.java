package Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeosMundiaisFifa = new HashMap<>();
        // adiciona os campeos mundias fifa no mapa
        campeosMundiaisFifa.put("Brasil", 5);
        campeosMundiaisFifa.put("Alemanha", 4);
        campeosMundiaisFifa.put("Itália", 4);
        campeosMundiaisFifa.put("Uruguai", 2);
        campeosMundiaisFifa.put("Argentina", 2);
        campeosMundiaisFifa.put("França", 2);
        campeosMundiaisFifa.put("Inglaterra",1 );
        campeosMundiaisFifa.put("Espanha", 1);

        System.out.println(campeosMundiaisFifa);

        //atualiza o valor para a chave Brasil
        campeosMundiaisFifa.put("Brasil", 6);

        System.out.println(campeosMundiaisFifa);
        //retorna a Argentina
        System.out.println(campeosMundiaisFifa.get("Argentina"));

        //retorna se existe ou nao um campeao França
        System.out.println(campeosMundiaisFifa.containsKey("França"));

        // remove o campeao França
        campeosMundiaisFifa.remove("França");
        //retorna se existe ou nao um campeao França
        System.out.println(campeosMundiaisFifa.containsKey("França"));

        //retorna se existe ou nao alguma selecao hexa campea
        System.out.println(campeosMundiaisFifa.containsValue(6));

        //retorna o tamanho do mapa
        System.out.println(campeosMundiaisFifa.size());

        System.out.println(campeosMundiaisFifa);

        //navega nos registros do mapa
        for (Map.Entry<String, Integer> entry: campeosMundiaisFifa.entrySet()) {
            System.out.println(entry.getKey() + "-->>" + entry.getValue());
        }

        // navega nos resgistros do mapa
        for (String key : campeosMundiaisFifa.keySet()) {
            System.out.println(key + "--" + campeosMundiaisFifa.get(key));
        }

        System.out.println(campeosMundiaisFifa);

        //verifica se o mapa contem a chave Estados Unidos
        System.out.println(campeosMundiaisFifa.containsKey("Estados Unidos"));

        //verifica se o mapa contem o valor 5
        System.out.println(campeosMundiaisFifa.containsValue(5));

        //verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeosMundiaisFifa.size());

        campeosMundiaisFifa.clear();

        System.out.println(campeosMundiaisFifa.size());

}}
