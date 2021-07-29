import java.util.function.Function;

public class test {
    public static void main(String[] args) {
        Function<Integer,Double> dividirPor2  = (var numero) -> numero / 2.0;
        System.out.println(dividirPor2.apply(15));
    }
}
