// Exercício 26: ArrayDeque como pilha (histórico de desfazer)
import java.util.*;
public class Ex26 {
    public static void main(String[] args) {
        Deque<String> undo = new ArrayDeque<>();
        undo.push("digitou A"); undo.push("digitou B"); undo.push("apagou B");
        while (!undo.isEmpty())
            System.out.println("Desfazer: " + undo.pop()); // LIFO: último a entrar, primeiro a sair
    }
}
