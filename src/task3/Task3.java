/*Создать программу,которая будет:
        подсчитывать количество слов в предложении
        выводить их в отсортированном виде
        делать первую букву каждого слова заглавной.
        Предложение вводится вручную.(Разделитель пробел(“ ”)).*/

package task3;

import java.util.*;

public class Task3 {

    public static String firstUpper(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        } else {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Input sentence");
        String str = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(str);

        while (tokenizer.hasMoreElements()) {
            list.add(firstUpper(tokenizer.nextToken()));
        }
        list.sort(Comparator.comparingInt(String::length));
        for (String s : list) {
            System.out.println(s);
        }
        sc.close();
    }
}
