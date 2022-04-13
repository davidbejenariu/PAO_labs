package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class WordReaderThread extends Thread {
    // prin final devine imutabil
    private final Path path;
    // Optional ca sa nu folosim null, e ca o cutie despre care nu stim daca e goala sau are ceva in ea
    private Optional<List<String>> result;

    public WordReaderThread(String pathString) {
        this.path = Paths.get(pathString);
        this.result = Optional.empty();
    }

    public Optional<List<String>> getResult() {
        return result;
    }

    /**
     * Regulile suprascrierii:
     *      1. metoda care suprascrie trebuie sa aiba acelasi nume si exact aceiasi parametri ca metoda suprascrisa
     *      2. tipul returnat
     *              a. daca metoda suprascrisa e void sau tip primitiv -> trebuie sa fie acelasi
     *              b. daca metoda suprascrisa este de tip obiect -> trebuie sa respecte regulile polimorfismului
     *                 (o metoda de tip clasa derivata poate lua forma clasei de baza)
     *                      ex: clasa Animal are metoda de tip Animal, deci clasa Caine care mosteneste Animal poate
     *                          suprascrie aceeasi metoda dar sa fie de tip Caine
     *      3. modul de acces al metodei care suprascrie trebuie sa fie cel putin la fel de public
     *         (public > protected > default > private)
     *      4. daca metoda suprascrisa arunca un anumit set de exceptii, metoda care suprascrie nu poate arunca mai
     *         multe (eventual mai putine)
     */

    @Override
    public void run() {
        // nu putem folosi throws IOException pt ca e Override si nu putem arunca mai multe exceptii decat clasa Thread
        // IOException nu e eroare aruncata de Thread (vezi regula 4)
        try {
            var content = Files.readString(path);
            var words = content.split("\\s+"); // \\s+ = 1 sau mai multe spatii

            result = Optional.of(Arrays.asList(words));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
