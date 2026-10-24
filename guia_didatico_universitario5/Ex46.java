// Exercício 46: estatísticas de List<? extends Number> mantendo type safety
import java.util.*;
public class Ex46 {
    static void estatisticas(List<? extends Number> l) {
        DoubleSummaryStatistics s = l.stream().mapToDouble(Number::doubleValue).summaryStatistics();
        System.out.println("min=" + s.getMin() + " max=" + s.getMax() + " média=" + s.getAverage() + " soma=" + s.getSum());
    }
    public static void main(String[] args) {
        estatisticas(List.of(1, 2, 3, 4));
        estatisticas(List.of(1.5, 2.5));
    }
}
