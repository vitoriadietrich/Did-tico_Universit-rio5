// Exercício 25: ArrayList x LinkedList nas extremidades
import java.util.*;
public class Ex25 {
    static long medir(List<Integer> lista) {
        long ini = System.nanoTime();
        for (int i = 0; i < 50_000; i++) lista.add(0, i); // inserir no INÍCIO
        return (System.nanoTime() - ini) / 1_000_000;
    }
    public static void main(String[] args) {
        System.out.println("ArrayList:  " + medir(new ArrayList<>()) + " ms");  // desloca todos os elementos
        System.out.println("LinkedList: " + medir(new LinkedList<>()) + " ms"); // só troca ligações
        // Escolha: se o uso é inserir/remover no início, LinkedList (ou ArrayDeque) ganha.
        // Para ler por índice e uso geral, ArrayList é a melhor escolha.
    }
}
