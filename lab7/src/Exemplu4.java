import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu4 {
    public static void main(String[] args) {
        List<String> list = List.of("aa", "bbb", "cc", "dddd");

//        Map<Integer, String> result = list.stream()
//                .collect(Collectors.groupingBy(x -> x.length(), Collectors.joining()));

        Map<Integer, Long> result = list.stream()
                .collect(Collectors.groupingBy(x -> x.length(), Collectors.counting()));


        System.out.println(result);
    }
}