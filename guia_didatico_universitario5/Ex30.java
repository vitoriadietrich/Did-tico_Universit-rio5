// Exercício 30: somar(List<? extends Number>) com inteiros e doubles
import java.util.*;
public class Ex30 {
    static double somar(List<? extends Number> lista) { // aceita List<Integer>, List<Double>...
        double total = 0;
        for (Number n : lista) total += n.doubleValue();
        return total;
    }
    public static void main(String[] args) {
        System.out.println(somar(List.of(1, 2, 3)));   // 6.0
        System.out.println(somar(List.of(1.5, 2.5)));  // 4.0
    }
}
