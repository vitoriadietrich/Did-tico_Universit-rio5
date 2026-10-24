// Exercício 18: record Produto ordenado por preço com Comparator
import java.util.*;
public class Ex18 {
    record Produto(String nome, double preco) {}
    public static void main(String[] args) {
        List<Produto> ps = new ArrayList<>(List.of(new Produto("Monitor", 900), new Produto("Mouse", 80)));
        ps.sort(Comparator.comparingDouble(Produto::preco)); // critério: preço
        System.out.println(ps);
    }
}
