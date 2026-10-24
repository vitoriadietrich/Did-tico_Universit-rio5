// Exercício 41: importador que ACUMULA erros por linha sem parar
// Regra: lança exceção quando a linha é inválida; o importador captura e COLETA a mensagem para seguir adiante.
import java.util.*;
public class Ex41 {
    static int lerLinha(String linha) { // lança em caso de erro (quem chama decide o que fazer)
        try { return Integer.parseInt(linha.trim()); }
        catch (NumberFormatException e) { throw new IllegalArgumentException("valor inválido '" + linha + "'", e); }
    }
    public static void main(String[] args) {
        List<String> linhas = List.of("10", "abc", "30", "x");
        List<Integer> ok = new ArrayList<>(); List<String> erros = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            try { ok.add(lerLinha(linhas.get(i))); }
            catch (IllegalArgumentException e) { erros.add("Linha " + (i + 1) + ": " + e.getMessage()); } // coleta
        }
        System.out.println("OK: " + ok);
        erros.forEach(System.out::println);
    }
}
