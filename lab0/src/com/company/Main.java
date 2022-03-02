package com.company;

import com.company.models.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        Teacher teacher = new Teacher();

        // tipuri de date
        // 1. numerice
        byte myByte = 1;

        Byte minB = Byte.MIN_VALUE;
        Byte maxB = Byte.MAX_VALUE;

        short myShort = 30000;
        Short minS = Short.MIN_VALUE;

        int myInt = 100_000_000;
        Integer minI = Integer.MIN_VALUE;
        Integer maxI = Integer.MAX_VALUE;

        long myLong = 100_000_000_000_000L;
        Long minL = Long.MIN_VALUE;

        float myFloat = (float) 2.14;
        double myDouble = 2.14;

        // 2. alfanumerice
        char c = 'a';
        char d = 'c';

        String myString = "abc";

        // 3. other
        boolean t = true;
        boolean f = false;

        System.out.println("Hello World!");
    }
}
