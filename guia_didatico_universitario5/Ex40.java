// Exercício 40: Stream - filtra em estoque, ordena por preço e devolve só os nomes
import java.util.*;
public class Ex40 {
    record Produto(String nome, double preco, int estoque) {}
    public static void main(String[] args) {
        List<Produto> ps = List.of(new Produto("Monitor", 900, 0), new Produto("Teclado", 150, 4), new Produto("Mouse", 80, 10));
        List<String> nomes = ps.stream()
            .filter(p -> p.estoque() > 0)                       // só com estoque
            .sorted(Comparator.comparingDouble(Produto::preco)) // mais barato primeiro
            .map(Produto::nome)                                 // só o nome
            .toList();
        System.out.println(nomes); // [Mouse, Teclado]
    }
}
