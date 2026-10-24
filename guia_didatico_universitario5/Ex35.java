// Exercício 35: computeIfAbsent agrupando alunos por turma
import java.util.*;
public class Ex35 {
    public static void main(String[] args) {
        Map<String, List<String>> turmas = new HashMap<>();
        String[][] dados = {{"A", "Ana"}, {"B", "Bia"}, {"A", "Caio"}};
        for (String[] d : dados)
            turmas.computeIfAbsent(d[0], k -> new ArrayList<>()).add(d[1]); // cria a lista só se faltar
        System.out.println(turmas); // {A=[Ana, Caio], B=[Bia]}
    }
}
