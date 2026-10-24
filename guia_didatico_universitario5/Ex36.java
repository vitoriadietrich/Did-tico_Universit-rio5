// Exercício 36: Repositorio<T,ID> com salvar e buscarPorId
import java.util.*;
import java.util.function.Function;
public class Ex36 {
    static class Repositorio<T, ID> {
        private final Map<ID, T> dados = new HashMap<>();
        private final Function<T, ID> extratorId; // ensina como pegar o id de um T
        Repositorio(Function<T, ID> extratorId) { this.extratorId = extratorId; }
        void salvar(T item) { dados.put(extratorId.apply(item), item); }
        Optional<T> buscarPorId(ID id) { return Optional.ofNullable(dados.get(id)); }
    }
    record Cliente(int id, String nome) {}
    public static void main(String[] args) {
        Repositorio<Cliente, Integer> repo = new Repositorio<>(Cliente::id);
        repo.salvar(new Cliente(1, "Ana"));
        System.out.println(repo.buscarPorId(1).orElse(null));
    }
}
