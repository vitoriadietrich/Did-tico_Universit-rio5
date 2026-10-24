// Exercício 11: validarIdade lança IllegalArgumentException para idade negativa
public class Ex11 {
    static void validarIdade(int idade) {
        if (idade < 0) throw new IllegalArgumentException("Idade negativa"); // throw lança o erro
    }
    public static void main(String[] args) {
        try { validarIdade(-5); }
        catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
    }
}
