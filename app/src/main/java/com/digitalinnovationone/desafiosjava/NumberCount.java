package com.digitalinnovationone.desafiosjava;

import java.util.*;

public class NumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        ArrayList<Integer> inputNumbers = new ArrayList<>();
        int limitInput = sc.nextInt();

        while (limitInput > 0) {
            inputNumbers.add(sc.nextInt());
            limitInput--;
        }

        SortedMap<Integer, Integer> numbers = new TreeMap<>();
        inputNumbers.forEach(id -> numbers.compute(id,
                (num,qnt) -> (qnt == null) ? 1 : qnt+1));

        numbers.entrySet().forEach(item -> {
            System.out.printf("%d aparece %d vez(es)\n", item.getKey(), item.getValue());
        });

        sc.close();
    }
}
