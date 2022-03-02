package com.company.examples;

public class Instructions {
    public static void main(String[] args) {
        // decizionale
        String colour = "black";

        if ("red".equals(colour)) {
            System.out.println("It's red");
        } else if ("green".equals(colour)) {
            System.out.println("It's green");
        } else {
            System.out.println("It's idk what");
        }

        switch (colour) {
            case "red":
                System.out.println("It's red");
                break;
            case "green":
                System.out.println("It's green");
                break;
            case "blue":
                System.out.println("It's blue");
                break;
            default:
                System.out.println("It's idk what");
        }

        // repetitive

        for (int i = 0; i < 10; ++i) {
            if (i == 3) {
                continue;
            }

            System.out.println(i);

            if (i == 5) {
                break;
            }
        }

        int age = 23;

        while (age > 20) {
            System.out.println(age--);
        }

        int total = 10;

        do {
            System.out.println(total);
        } while (total > 11);

        // salt
    }
}
