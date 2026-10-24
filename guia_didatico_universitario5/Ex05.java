// Exercício 5: mesmo nome duas vezes em um HashSet
import java.util.*;
public class Ex05 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("Ana", "Ana"));
        Set<String> set = new HashSet<>(lista);
        System.out.println("List: " + lista.size() + " | Set: " + set.size()); // 2 | 1
    }
}
