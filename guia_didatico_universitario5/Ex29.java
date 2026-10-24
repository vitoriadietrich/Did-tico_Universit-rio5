// Exercício 29: método genérico ultimo(T[] valores)
public class Ex29 {
    static <T> T ultimo(T[] valores) { // <T> antes do retorno = método genérico
        return valores.length == 0 ? null : valores[valores.length - 1];
    }
    public static void main(String[] args) {
        System.out.println(ultimo(new String[]{"A", "B", "C"})); // C
        System.out.println(ultimo(new Integer[]{10, 20}));       // 20
    }
}
