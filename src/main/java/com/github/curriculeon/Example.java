package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        rangePrinter(10);
    }

    public static void rangePrinter(int y) {
        List<Integer> computedList = range(y);
        listPrinter(computedList);
    }

    public static List<Integer> range(int maxValue) {
        System.out.println("Yerpp! I'm creating a list!");
        List<Integer> result = new ArrayList<>();
        for (int currentInteger = 0; currentInteger < maxValue; currentInteger++) {
            result.add(currentInteger);
        }
        return result;
    }

    public static void listPrinter(List<Integer> list) {
        System.out.println("Yerpp! I'm printing a list!");
        for(int i : list) {
            System.out.println(i);
        }
    }

}
