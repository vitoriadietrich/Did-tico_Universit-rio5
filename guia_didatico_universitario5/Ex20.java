// Exercício 20: Predicate<Integer> para número positivo
import java.util.function.Predicate;
public class Ex20 {
    public static void main(String[] args) {
        Predicate<Integer> positivo = n -> n > 0;
        System.out.println(positivo.test(5));  // true
        System.out.println(positivo.test(-3)); // false
    }
}
