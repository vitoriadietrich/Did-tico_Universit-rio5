// Exercício 45: índice invertido Map<String,Set<Integer>> (palavra -> ids dos documentos)
import java.util.*;
public class Ex45 {
    public static void main(String[] args) {
        String[] docs = {"java é bom", "java e sql", "sql é útil"};
        Map<String, Set<Integer>> indice = new TreeMap<>();
        for (int id = 0; id < docs.length; id++)
            for (String palavra : docs[id].split(" "))
                indice.computeIfAbsent(palavra, k -> new TreeSet<>()).add(id);
        System.out.println(indice); // ex.: java=[0, 1]
    }
}
