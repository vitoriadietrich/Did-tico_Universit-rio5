// Exercício 17: ordenar crescente e decrescente
import java.util.*;
public class Ex17 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(8, 5, 10, 7));
        Collections.sort(nums);
        System.out.println("Crescente: " + nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println("Decrescente: " + nums);
    }
}
