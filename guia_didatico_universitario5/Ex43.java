// Exercício 43: cache genérico com getOrCompute(K, Function<K,V>)
import java.util.*;
import java.util.function.Function;
public class Ex43 {
    static class Cache<K, V> {
        private final Map<K, V> dados = new HashMap<>();
        V getOrCompute(K chave, Function<K, V> calculo) {
            return dados.computeIfAbsent(chave, calculo); // só calcula se ainda não estiver no cache
        }
    }
    public static void main(String[] args) {
        Cache<Integer, Integer> c = new Cache<>();
        Function<Integer, Integer> quadrado = n -> { System.out.println("calculando " + n); return n * n; };
        System.out.println(c.getOrCompute(4, quadrado)); // calcula
        System.out.println(c.getOrCompute(4, quadrado)); // vem do cache (sem "calculando")
    }
}
