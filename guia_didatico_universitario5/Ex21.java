// Exercício 21: EstoqueInsuficienteException ao retirar mais que o estoque
public class Ex21 {
    static class EstoqueInsuficienteException extends RuntimeException { // exceção do domínio
        EstoqueInsuficienteException(String msg) { super(msg); }
    }
    static int retirar(int estoque, int qtd) {
        if (qtd > estoque) throw new EstoqueInsuficienteException("Disponível: " + estoque);
        return estoque - qtd;
    }
    public static void main(String[] args) {
        try { retirar(2, 5); }
        catch (EstoqueInsuficienteException e) { System.out.println("Erro: " + e.getMessage()); }
    }
}
