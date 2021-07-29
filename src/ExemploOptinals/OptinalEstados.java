package ExemploOptinals;

import java.util.Optional;

public class OptinalEstados {

    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("null está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcinal que nao está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        Optional<String> emptyOptinal = Optional.empty();

        System.out.println("Valor opcional que não está presente");
        emptyOptinal.ifPresentOrElse(System.out::println, () -> System.out.println("empty = nao está presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que lança erro NullPointException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = nao está presente"));
    }
}
