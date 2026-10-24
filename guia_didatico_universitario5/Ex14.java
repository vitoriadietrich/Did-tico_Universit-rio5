// Exercício 14: HashSet remove IDs duplicados
import java.util.*;
public class Ex14 {
    public static void main(String[] args) {
        List<Integer> ids = List.of(1, 2, 2, 3, 3, 3);
        Set<Integer> unicos = new HashSet<>(ids); // Set descarta repetidos
        System.out.println(unicos);
    }
}
