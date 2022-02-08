package blockOne;

import java.util.*;

/**
 * Отыскание первого неповторяющегося символа.
 * Написать программу, которая возвращает первый неповторяющийся (некратный) символ в заданной строке.
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(searchFirstSimbol("afdsfdsfdsfhjja"));
    }

    public static char searchFirstSimbol(String str) {
        Map<Character, Integer> integerMap = new HashMap<>();
        for (char ch: str.toCharArray()) {
            integerMap.compute(ch, (k,v) -> (v == null) ? 1 : ++v);
        }

         Optional<Character> opt = integerMap.entrySet()
                .stream()
                .filter(v -> v.getValue() == 1)
                .findFirst()
                 .map(Map.Entry::getKey);

        return opt.get();
    }
}
