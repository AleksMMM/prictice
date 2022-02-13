package blockOne;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * Подсчет гласных и согласных. Написать программу, которая подсчитывает
 * число гласных и согласных букв в заданной строке.
 * Сделать это для английского языка, который имеет пять гласных (а, е, /, о и и).
 */

public class Task5 {
    public static void main(String[] args) {
        countAlphabet("dfdfffsdf");
        count("sdghftytyvcbcvaaa");
    }

    public static void countAlphabet(String srt) {
        int gl = 0;
        int sogl = 0;
        Set<Character> characterSet = new HashSet<Character>();
        characterSet.add('a');
        characterSet.add('e');
        characterSet.add('i');
        characterSet.add('o');
        characterSet.add('u');
        characterSet.add('y');

        Set<Character> ch2 = new HashSet();
        for (char c : srt.toCharArray()) {
            ch2.add(c);
        }
        int size = ch2.size();
        ch2.removeAll(characterSet);
        gl = size - ch2.size();
        sogl = ch2.size();

        System.out.println(gl + " " + sogl);

    }

    public static void count(String str) {
        str = str.toLowerCase();
         Set<Character> allVowels
                = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

         int volwes = (int) str.chars()
                 .filter(allVowels::contains)
                 .count();

         int cosnants = (int) str.chars()
                 .filter(v -> !allVowels.contains(v))
                 .count();

        System.out.println(volwes +  " " + cosnants);
    }
}
