// Exercício 33: serviço devolve List.copyOf; o chamador não consegue modificar a lista interna
import java.util.*;
public class Ex33 {
    static class Servico {
        private final List<String> dados = new ArrayList<>(List.of("A", "B"));
        List<String> listar() { return List.copyOf(dados); } // cópia imutável
    }
    public static void main(String[] args) {
        List<String> copia = new Servico().listar();
        try { copia.add("C"); }
        catch (UnsupportedOperationException e) { System.out.println("Não pode modificar a lista interna"); }
    }
}
