// Exercício 4: nome duplicado em uma List
import java.util.*;
public class Ex04 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana"); nomes.add("Ana"); // List aceita duplicados
        System.out.println(nomes);          // [Ana, Ana]
    }
}
