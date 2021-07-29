package ExemploOptinals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptinalPrimitivos {
    public static void main(String[] args) {
        System.out.println("***Valor inteiro Opcional***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("Valor decimal opcional");
        OptionalDouble.of(55.0).ifPresent(System.out::println);

        System.out.println("Valor Long opcional");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
}
