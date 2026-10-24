// Exercício 10: interface funcional Saudacao + lambda
public class Ex10 {
    @FunctionalInterface
    interface Saudacao { void dizer(String nome); }
    public static void main(String[] args) {
        Saudacao s = nome -> System.out.println("Olá, " + nome + "!");
        s.dizer("Vitória");
    }
}
