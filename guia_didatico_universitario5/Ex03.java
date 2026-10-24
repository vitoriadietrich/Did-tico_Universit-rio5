// Exercício 3: ArrayList com três nomes, tamanho e elemento do índice 1
import java.util.*;
public class Ex03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Ana", "Bia", "Caio"));
        System.out.println(nomes.size()); // 3
        System.out.println(nomes.get(1)); // Bia (índice começa em 0)
    }
}
