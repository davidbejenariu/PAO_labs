import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu5 {
    public static void main(String[] args) {
        List<String> list = List.of("aa", "bbb", "cc", "dddd");

        List<Integer> result = new ArrayList<>();

        /*list.stream()         //gresit(modifica ceva din exterior)
                .map(x -> x.length())
                .forEach(x -> result.add(x));
        System.out.println(result);*/

        result = list.stream()
                    .map(x -> x.length())
                    .collect(Collectors.toList());
        System.out.println(result);
    }
}
