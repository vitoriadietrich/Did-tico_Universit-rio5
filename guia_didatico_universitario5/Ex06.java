// Exercício 6: HashMap de estoque, consulta por chave
import java.util.*;
public class Ex06 {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("Mouse", 10); estoque.put("Teclado", 5); estoque.put("Monitor", 2);
        System.out.println(estoque.get("Teclado")); // 5
    }
}
