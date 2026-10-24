// Exercício 12: finally executa depois da tentativa de conversão
public class Ex12 {
    public static void main(String[] args) {
        try { Integer.parseInt("x1"); }
        catch (NumberFormatException e) { System.out.println("Conversão falhou"); }
        finally { System.out.println("Tentativa finalizada"); } // roda dando erro ou não
    }
}
