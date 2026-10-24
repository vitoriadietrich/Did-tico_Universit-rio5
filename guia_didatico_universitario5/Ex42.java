// Exercício 42: serviço com exceções de domínio traduzidas no main em mensagens amigáveis
public class Ex42 {
    static class SaldoInsuficienteException extends RuntimeException { SaldoInsuficienteException() { super("saldo"); } }
    static class ContaInexistenteException extends RuntimeException { ContaInexistenteException() { super("conta"); } }
    static void sacar(int conta, double saldo, double valor) {
        if (conta != 1) throw new ContaInexistenteException();
        if (valor > saldo) throw new SaldoInsuficienteException();
    }
    public static void main(String[] args) {
        try { sacar(2, 100, 50); }
        catch (ContaInexistenteException e) { System.out.println("Conta não encontrada, confira o número."); }
        catch (SaldoInsuficienteException e) { System.out.println("Saldo insuficiente para o saque."); }
        try { sacar(1, 100, 500); }
        catch (ContaInexistenteException e) { System.out.println("Conta não encontrada, confira o número."); }
        catch (SaldoInsuficienteException e) { System.out.println("Saldo insuficiente para o saque."); }
    }
}
