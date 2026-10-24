// Exercício 37: ? super Integer preenchendo uma List<Number> (PECS)
import java.util.*;
public class Ex37 {
    static void preencher(List<? super Integer> destino) { // aceita List<Integer>, List<Number>, List<Object>
        destino.add(10); destino.add(20);
    }
    public static void main(String[] args) {
        List<Number> numeros = new ArrayList<>();
        preencher(numeros);
        System.out.println(numeros);
        // PECS = Producer Extends, Consumer Super:
        // quem PRODUZ (lemos dela) usa "extends"; quem CONSOME (escrevemos nela) usa "super".
    }
}
