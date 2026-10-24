// Exercício 49: projeto integrador (pedidos) + cinco testes manuais de falha
import java.util.*;
import java.util.function.Predicate;
public class Ex49 {
    static class EstoqueInsuficienteException extends RuntimeException { EstoqueInsuficienteException(String m) { super(m); } }
    static class PedidoInvalidoException extends RuntimeException { PedidoInvalidoException(String m) { super(m); } }
    record Produto(int id, String nome, double preco, int estoque) {}
    static class Loja {
        Map<Integer, Produto> catalogo = new HashMap<>();   // lookup por ID
        Queue<String> fila = new ArrayDeque<>();            // fila de pedidos
        double faturamento = 0;
        void vender(int id, int qtd) {
            if (qtd <= 0) throw new PedidoInvalidoException("Quantidade inválida");
            Produto p = catalogo.get(id);
            if (p == null) throw new PedidoInvalidoException("Produto " + id + " inexistente");
            if (p.estoque() < qtd) throw new EstoqueInsuficienteException("Só há " + p.estoque());
            catalogo.put(id, new Produto(id, p.nome(), p.preco(), p.estoque() - qtd));
            faturamento += p.preco() * qtd;
        }
    }
    public static void main(String[] args) {
        Loja l = new Loja();
        l.catalogo.put(1, new Produto(1, "Mouse", 80, 5));
        l.vender(1, 2);
        System.out.println("Faturamento: " + l.faturamento);
        // Cinco testes manuais de falha:
        int[][] testes = {{1, 0}, {1, -1}, {9, 1}, {1, 99}, {2, 1}};
        for (int[] t : testes) {
            try { l.vender(t[0], t[1]); }
            catch (PedidoInvalidoException | EstoqueInsuficienteException e) {
                System.out.println("Falha esperada -> " + e.getMessage());
            }
        }
        Predicate<Produto> emEstoque = p -> p.estoque() > 0;
        System.out.println("Em estoque: " + l.catalogo.values().stream().filter(emEstoque).map(Produto::nome).toList());
    }
}
