// Exercício 31: exceção própria que carrega o valor disponível do limite
public class Ex31 {
    static class LimiteCreditoException extends RuntimeException {
        private final double disponivel; // dado estruturado, além da mensagem
        LimiteCreditoException(double disponivel) { super("Limite insuficiente"); this.disponivel = disponivel; }
        double getDisponivel() { return disponivel; }
    }
    public static void main(String[] args) {
        try { throw new LimiteCreditoException(900); }
        catch (LimiteCreditoException e) { System.out.println(e.getMessage() + ". Disponível: " + e.getDisponivel()); }
    }
}
