// Exercício 19: classe genérica Caixa<T> com String e Integer
public class Ex19 {
    static class Caixa<T> {            // T = tipo definido na hora de usar
        private final T valor;
        Caixa(T valor) { this.valor = valor; }
        T get() { return valor; }
    }
    public static void main(String[] args) {
        Caixa<String> a = new Caixa<>("Java");
        Caixa<Integer> b = new Caixa<>(42);
        System.out.println(a.get().toUpperCase() + " " + (b.get() + 1)); // sem cast
    }
}
