// Exercício 34: Set<Produto> com equals/hashCode manuais usando só o id
import java.util.*;
public class Ex34 {
    static class Produto {
        int id; String nome;
        Produto(int id, String nome) { this.id = id; this.nome = nome; }
        @Override public boolean equals(Object o) { return o instanceof Produto p && p.id == id; }
        @Override public int hashCode() { return Integer.hashCode(id); }
    }
    public static void main(String[] args) {
        Set<Produto> set = new HashSet<>();
        set.add(new Produto(1, "Mouse"));
        set.add(new Produto(1, "Mouse novo")); // mesmo id = duplicado
        System.out.println(set.size());        // 1
    }
}
