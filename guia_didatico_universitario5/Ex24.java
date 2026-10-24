// Exercício 24: catálogo Map<Integer,Produto> com cadastrar, buscar e remover
import java.util.*;
public class Ex24 {
    record Produto(int id, String nome) {}
    static class Catalogo {
        private final Map<Integer, Produto> dados = new HashMap<>();
        void cadastrar(Produto p) { dados.put(p.id(), p); }
        Produto buscar(int id) { return dados.get(id); }  // null se não existir
        void remover(int id) { dados.remove(id); }
    }
    public static void main(String[] args) {
        Catalogo c = new Catalogo();
        c.cadastrar(new Produto(1, "Mouse"));
        System.out.println(c.buscar(1));
        c.remover(1);
        System.out.println(c.buscar(1)); // null
    }
}
