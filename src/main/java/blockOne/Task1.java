package blockOne;

import java.util.*;

/**
 * Подсчет повторяющихся символов.
 * Написать программу, которая подсчитывает повторяющиеся символы в заданной строке
 */
public class Task1 {

    public static void main(String[] args) {

    }

    public static Map<Character, Integer> countChar(String str) {
        Map<Character, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            integerMap.compute(ch, (k,v) -> (v == null) ? 1 : ++v );
        }

        return integerMap;

    }

}
