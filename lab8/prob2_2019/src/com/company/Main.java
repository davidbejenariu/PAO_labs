package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("poezie_1.txt", "poezie_2.txt");
        List<WordReaderThread> threadList = new ArrayList<WordReaderThread>();

        for (String filename : list) {
            WordReaderThread thread = new WordReaderThread(filename);
            thread.start();
            threadList.add(thread);
        }

        try {
            for (var thread : threadList) {
                // asteptam ca fiecare fir de executie sa se termine
                thread.join();
            }


            Set<String> words = new HashSet<>();

            for (var thread : threadList) {
                var result = thread.getResult().orElse(List.of());
                words.addAll(result);
            }

            System.out.println(words);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
