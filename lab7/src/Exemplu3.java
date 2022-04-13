import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplu3 {
    public static void main(String[] args) {
        List<String> vocale = List.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U" );
        List<String> vocale2 = List.of("a", "e", "i", "o", "u");
        List<String> list = new ArrayList<String>();
        list.add("Ana");
        list.add("are");
        list.add("mere");

        long v = list.stream()
                .flatMap(x -> Arrays.stream( x.split("")))
                .filter(x -> vocale.contains(x.toLowerCase()))
                .count();
        System.out.println(v);


    }
}
