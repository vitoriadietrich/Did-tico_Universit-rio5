// Exercício 8: percorrer List<Integer> com Iterator
import java.util.*;
public class Ex08 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3);
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) System.out.println(it.next()); // hasNext pergunta, next entrega
    }
}
