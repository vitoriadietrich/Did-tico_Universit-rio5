// Exercício 39: Function<Produto,String> convertendo Produto em linha de relatório
import java.util.function.Function;
public class Ex39 {
    record Produto(String nome, double preco) {}
    public static void main(String[] args) {
        Function<Produto, String> linha = p -> p.nome() + " ........ R$ " + p.preco();
        System.out.println(linha.apply(new Produto("Mouse", 80)));
    }
}
