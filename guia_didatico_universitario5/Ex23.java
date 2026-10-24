// Exercício 23: AutoCloseable próprio com try-with-resources
public class Ex23 {
    static class Recurso implements AutoCloseable {
        void usar() { System.out.println("Usando"); }
        @Override public void close() { System.out.println("close() chamado"); }
    }
    public static void main(String[] args) {
        try (Recurso r = new Recurso()) { // fecha sozinho ao sair do bloco
            r.usar();
        }
    }
}
