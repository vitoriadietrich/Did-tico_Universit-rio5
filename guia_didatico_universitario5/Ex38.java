// Exercício 38: classe anônima -> lambda -> Comparator.comparing
import java.util.*;
public class Ex38 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Caio", "Ana", "Beatriz"));
        nomes.sort(new Comparator<String>() {                      // 1) classe anônima
            public int compare(String a, String b) { return a.length() - b.length(); }
        });
        nomes.sort((a, b) -> a.length() - b.length());             // 2) lambda
        nomes.sort(Comparator.comparing(String::length));          // 3) Comparator.comparing
        System.out.println(nomes);
    }
}
