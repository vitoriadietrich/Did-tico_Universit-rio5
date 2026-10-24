// Exercício 44: Multimap simplificado com Map<K,List<V>>
import java.util.*;
public class Ex44 {
    static class Multimap<K, V> {
        private final Map<K, List<V>> mapa = new HashMap<>();
        void put(K k, V v) { mapa.computeIfAbsent(k, x -> new ArrayList<>()).add(v); } // vários valores por chave
        List<V> get(K k) { return mapa.getOrDefault(k, List.of()); }
    }
    public static void main(String[] args) {
        Multimap<String, String> m = new Multimap<>();
        m.put("frutas", "maçã"); m.put("frutas", "uva"); m.put("cores", "azul");
        System.out.println(m.get("frutas")); // [maçã, uva]
    }
}
