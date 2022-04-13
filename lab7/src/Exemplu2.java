import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exemplu2 {
    public static void main(String[] args) {
        Set<String> hashSet1= new HashSet<String>();
        hashSet1.add("aa");
        hashSet1.add("bb");
        hashSet1.add("aaac");
        hashSet1.add("dddd");

        /*for (String x : hashSet1) {
            System.out.println(x);
        }*/

        /*int sum = hashSet1.stream()
                    .map(x -> x.length())
                    .reduce(0, (x,y) -> x+y);
        System.out.println(sum);*/

        /*int sum = hashSet1.stream()
                .mapToInt(x -> x.length())
                .sum();
        System.out.println(sum);*/

        /*long litereDistincte = hashSet1.stream()
                .flatMap(x -> Arrays.stream(x.split("")))
                .distinct()
                .count();
        System.out.println(litereDistincte);*/


    }
}
