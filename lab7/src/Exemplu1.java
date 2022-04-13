import java.util.ArrayList;
import java.util.List;

public class Exemplu1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(3);
        list1.add(5);
        list1.add(1);
        list1.add(8);

        /*for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }*/

        /*for (Integer x : list1) {
            System.out.println(x);
        }*/

        /*for (Integer x : list1) {
            System.out.println(2*x);
        }*/

        list1.stream()
                .sorted()
                .map(x -> 2*x)
                .forEach(x -> System.out.println(x));
    }
}
