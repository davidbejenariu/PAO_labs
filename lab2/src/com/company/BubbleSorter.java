package com.company;

public class BubbleSorter implements Sorter {
    @Override
    /**
     * nu este obligatoriu dpdv sintactic, dar este good practice sa il folosim
     * in java nu exista supraincarcare de operatori (doar de metode)
     */
    public int[] sort(int[] list) {
        boolean sorted;
        int aux;

        do {
            sorted = true;

            // length e atribut, nu metoda (deci fara paranteze)
            // la string se pune paranteze la length (pt string este 'comportament')
            for (int i = 0; i < list.length - 1; ++i) {
                if (list[i] > list[i + 1]) {
                    aux = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = aux;

                    sorted = false;
                }
            }
        } while (!sorted);

        return list;
    }
}
