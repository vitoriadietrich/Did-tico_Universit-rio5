// Exercício 7: Queue com três chamados e poll
import java.util.*;
public class Ex07 {
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();
        fila.offer("Chamado 1"); fila.offer("Chamado 2"); fila.offer("Chamado 3");
        System.out.println(fila.poll()); // remove e devolve o primeiro (FIFO)
        System.out.println(fila);        // [Chamado 2, Chamado 3]
    }
}
