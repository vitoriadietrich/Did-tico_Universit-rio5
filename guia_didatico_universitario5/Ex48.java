// Exercício 48: faturamento por vendedor (groupingBy + summingDouble) ordenado do maior para o menor
import java.util.*;
import java.util.stream.Collectors;
public class Ex48 {
    record Venda(String vendedor, double valor) {}
    public static void main(String[] args) {
        List<Venda> vendas = List.of(new Venda("Ana", 100), new Venda("Bia", 50), new Venda("Ana", 200), new Venda("Caio", 120));
        Map<String, Double> total = vendas.stream()
            .collect(Collectors.groupingBy(Venda::vendedor, Collectors.summingDouble(Venda::valor)));
        total.entrySet().stream()
            .sorted(Map.Entry.<String, Double>comparingByValue().reversed()) // maior primeiro
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
