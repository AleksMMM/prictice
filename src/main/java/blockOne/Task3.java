package blockOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Инвертирование букв и слов.
 * Написать программу, которая инвертирует буквы каждого слова,
 * и программу, которая инвертирует буквы каждого слова и
 * сами слова.
 */

public class Task3 {
    public static void main(String[] args) {

        System.out.println(invertWords("ffdfsdf fsdfdsfds hghgffg kjkjhk"));
    }

    public static String invertWords(String string) {

        String[] str = string.split(" ");
        Collections.reverse(Arrays.asList(str));
        StringBuilder reversedString = new StringBuilder();

        for (String word: str) {
            StringBuilder reverseWords = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWords.append(word.charAt(i));
            }
            reversedString.append(reverseWords).append(" ");
        }



        return reversedString.toString();
    }


}
