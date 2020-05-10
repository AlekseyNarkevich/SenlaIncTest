/*Создать программу, которая подсчитывает сколько раз
        употребляется слово в тексте (без учета регистра).
        Текст и слово вводится вручную.*/

package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    static long countOfWord(String text, String word) {
        return (Arrays.stream(text.toLowerCase()
                .split("[.,\\s]"))
                .filter(word.toLowerCase()::equals).count());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();
        System.out.print("Input word: ");
        String word = sc.nextLine();

        System.out.println("The word - " + word + " is in text " + countOfWord(text, word) + " times");

        sc.close();
    }
}
