package com.company.examples;

public class Operators {
    public static void main(String[] args) {
        // 1. Postfix increment & decrement: expr++, expr--
        int age = 23;
        System.out.println(age++);
        System.out.println(age);

        // 2. Prefix increment & decrement: ++expr, --expr
        int total = 45;
        System.out.println(--total);
        System.out.println(total);

        // 3. Unary: +expr, -expr, ~, !

        // 4. Multiplicativi: *, /, %
        System.out.println(4 % 2);

        // 5. Aditivi: +, -, + (concatenare stringuri)
        // Asociativitatea este de la stanga la dreapta (mai putin pentru adunare)
        System.out.println(2 + 2);

        String firstName = "David";
        String lastName = "Behe";

        System.out.println(firstName + " " + lastName);

        // 6. Shiftare: <<, >>, >>>

        // 7. Relationali: <.<=, >, >=, instanceof
        System.out.println(2 <= 3);

        Byte b = 2;
        System.out.println(b instanceof Byte);
        System.out.println(b instanceof Number);
        System.out.println(b instanceof Object);

        // 8. Egalitate: ==, !=
        System.out.println(2 == 2);
        System.out.println("cat" == new String("cat"));

        // 9. Bitwise: &, |, ^

        // 10. Logical: &&, ||

        // 11. Ternary: x = (expression) ? value1 if true : value2 if false

        // 12. Asignare: =, +=, -=, *=, /=, %=, ^= etc.
    }
}
