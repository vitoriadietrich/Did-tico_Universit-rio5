// Exercício 22: método com throws IOException tratado no main
import java.io.IOException;
public class Ex22 {
    static void lerArquivo() throws IOException { // avisa que pode lançar checked exception
        throw new IOException("Arquivo não encontrado (simulado)");
    }
    public static void main(String[] args) {
        try { lerArquivo(); }
        catch (IOException e) { System.out.println(e.getMessage()); } // o compilador exige tratar
    }
}
