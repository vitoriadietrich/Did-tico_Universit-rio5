// Exercício 15: frequência de palavras com HashMap e merge
import java.util.*;
public class Ex15 {
    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<>();
        for (String p : "java é bom java é fácil java".split(" "))
            freq.merge(p, 1, Integer::sum); // se não existe põe 1; se existe soma 1
        System.out.println(freq);
    }
}
