package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<DiplomaLicenta> diplomeLicenta = new ArrayList<>();

        // 1
        Comparator<DiplomaLicenta> c1 = (d1, d2) -> {
            if (d1.getMedie() < d2.getMedie()) {
                return -1;
            } else if (d1.getMedie() > d2.getMedie()) {
                return 1;
            }

            return 0;
        };

        diplomeLicenta.stream()
                .filter(x -> x.getAn() > 2000 && x.getAn() < 2010)
                .sorted(c1)
                .forEach(System.out::println);

        // 2
        diplomeLicenta.stream()
                .filter(x -> x.getFacultate().equals("Facultatea de Informatica"))
                .filter(x -> x.getAn() == 2018)
                .map(x -> x.getSpecializare())
                .distinct()
                .forEach(System.out::println);

        // 3
        var absolventi = diplomeLicenta.stream()
                .filter(x -> x.getMedie() == 10)
                .map(x -> x.getAbsolvent())
                .collect(Collectors.toList());
                // .toList(); echivalentul lui collect(Collectors.toList()) a aparut in Java 17

        // 4
        var nrDiplome = diplomeLicenta.stream()
                .filter(x -> x.getSpecializare().equals("Informatica"))
                .count();
    }
}
