package blockOne;


/**
 * Проверка, содержит ли строковое значение только цифры.
 * Написать программу, которая проверяет, что заданная строка содержит только цифры.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(onlyNumbers("rewrrrwerew"));
        System.out.println(onlyNumbers("12345"));

        System.out.println(onlyNumbStream("123456"));
    }

    public static String onlyNumbers(String numb) {
        for (int i = 0; i < numb.length(); i++) {
            if (!Character.isDigit(numb.charAt(i)) ) {
                return  "";
            }
        }
        return numb;
    }
    // использую стрим перевожу строку в стрим
    public static boolean onlyNumbStream(String str) {
       return str.chars().allMatch(v -> Character.isDigit(v));
    }
}
