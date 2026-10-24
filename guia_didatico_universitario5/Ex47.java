// Exercício 47: filtros combináveis com Predicate.and, or e negate
import java.util.function.Predicate;
public class Ex47 {
    public static void main(String[] args) {
        Predicate<Integer> par = n -> n % 2 == 0;
        Predicate<Integer> maiorQue10 = n -> n > 10;
        System.out.println(par.and(maiorQue10).test(12));    // true  (par E maior que 10)
        System.out.println(par.or(maiorQue10).test(13));     // true  (par OU maior que 10)
        System.out.println(par.negate().test(4));            // false (NÃO par)
    }
}
