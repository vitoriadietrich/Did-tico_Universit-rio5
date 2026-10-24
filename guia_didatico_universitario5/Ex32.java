// Exercício 32: converte exceção técnica em exceção de domínio preservando a cause
public class Ex32 {
    static class CodigoInvalidoException extends RuntimeException {
        CodigoInvalidoException(String msg, Throwable causa) { super(msg, causa); } // guarda a causa original
    }
    static int converter(String texto) {
        try { return Integer.parseInt(texto); }
        catch (NumberFormatException e) { throw new CodigoInvalidoException("Código inválido: " + texto, e); }
    }
    public static void main(String[] args) {
        try { converter("A12"); }
        catch (CodigoInvalidoException e) {
            System.out.println(e.getMessage());
            System.out.println("Causa: " + e.getCause().getClass().getSimpleName()); // NumberFormatException
        }
    }
}
