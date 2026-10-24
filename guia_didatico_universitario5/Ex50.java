// Exercício 50: refatoração - qual loop fica imperativo e qual vira Stream
import java.util.*;
public class Ex50 {
    record Venda(String vendedor, double valor) {}
    public static void main(String[] args) {
        List<Venda> vendas = List.of(new Venda("Ana", 100), new Venda("Bia", 50), new Venda("Ana", 200));

        // 1) LOOP QUE DEVE CONTINUAR IMPERATIVO: tem efeito colateral e precisa PARAR no meio (break).
        // Um for é mais claro aqui; em Stream, interromper no meio com efeitos fica forçado.
        for (Venda v : vendas) {
            System.out.println("Processando " + v.vendedor());
            if (v.valor() > 150) { System.out.println("Limite atingido, parando."); break; }
        }

        // 2) PROCESSAMENTO MELHOR COM STREAM: filtrar + somar é uma transformação pura de dados,
        // sem estado externo mutável; lê como uma frase: filtra Ana, pega valores, soma.
        double totalAna = vendas.stream().filter(v -> v.vendedor().equals("Ana")).mapToDouble(Venda::valor).sum();
        System.out.println("Total Ana: " + totalAna);
    }
}
