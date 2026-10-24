// Exercício 27: Comparable em Aluno ordenando por matrícula
import java.util.*;
public class Ex27 {
    static class Aluno implements Comparable<Aluno> {
        int matricula; String nome;
        Aluno(int matricula, String nome) { this.matricula = matricula; this.nome = nome; }
        @Override public int compareTo(Aluno o) { return Integer.compare(matricula, o.matricula); } // ordem natural
        @Override public String toString() { return matricula + "-" + nome; }
    }
    public static void main(String[] args) {
        List<Aluno> l = new ArrayList<>(List.of(new Aluno(30, "Caio"), new Aluno(10, "Ana")));
        Collections.sort(l); // usa o compareTo
        System.out.println(l);
    }
}
