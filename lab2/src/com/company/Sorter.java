package com.company;

public interface Sorter {
    int[] sort(int[] list);

    static Sorter create(SorterType type) {
        return switch (type) {
            case BUBBLE -> new BubbleSorter();
            case INTER -> new InterchangeSorter();
            default -> throw new RuntimeException("Not a known type");
        };
    }

    public enum SorterType {
        BUBBLE,
        INTER
    }
}
