// Exercício 13: dois catches específicos
public class Ex13 {
    public static void main(String[] args) {
        String[] dados = {"10"};
        try {
            int i = Integer.parseInt("abc"); // troque por "5" para ver o outro catch
            System.out.println(dados[i]);
        } catch (NumberFormatException e) {
            System.out.println("Texto não numérico");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inexistente");
        }
    }
}
