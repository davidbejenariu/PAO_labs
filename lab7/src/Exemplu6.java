import java.util.*;

public class Exemplu6 {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Comparator<Cat> c = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Cat cat1 = new Cat("Pisi", 17);
        Cat cat2 = new Cat("Tom", 6);
        Cat cat3 = new Cat("Sylvester", 10);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        Collections.sort(cats, c);
        System.out.println(cats);
    }
}
