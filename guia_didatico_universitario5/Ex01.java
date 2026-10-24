// Exercício 1: provocar ArithmeticException e tratar com try/catch
public class Ex01 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);   // divisão inteira por zero lança ArithmeticException
        } catch (ArithmeticException e) { // captura só esse tipo de erro
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
