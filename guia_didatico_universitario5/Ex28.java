// Exercício 28: dois Comparators para Aluno (nome e nota)
import java.util.*;
public class Ex28 {
    record Aluno(String nome, double nota) {}
    public static void main(String[] args) {
        List<Aluno> l = new ArrayList<>(List.of(new Aluno("Caio", 7), new Aluno("Ana", 9)));
        Comparator<Aluno> porNome = Comparator.comparing(Aluno::nome);
        Comparator<Aluno> porNota = Comparator.comparingDouble(Aluno::nota);
        l.sort(porNome); System.out.println("Por nome: " + l);
        l.sort(porNota); System.out.println("Por nota: " + l);
    }
}
