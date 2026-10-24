// Exercício 2: Integer.parseInt com "123" e "abc"
public class Ex02 {
    public static void main(String[] args) {
        for (String s : new String[]{"123", "abc"}) {
            try { System.out.println(Integer.parseInt(s)); }
            catch (NumberFormatException e) { System.out.println("'" + s + "' não é número"); }
        }
    }
}
