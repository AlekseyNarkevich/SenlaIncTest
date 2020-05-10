/*Создать программу, которая в последовательности от 0 до N,
        находит все числа-палиндромы (зеркальное значение равно оригинальному).
        Длина последовательности N вводится вручную и не должна превышать 100.*/

package task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number from 0 to 100");
        int num = sc.nextInt();
        if (0 <= num && num <= 100) {
            System.out.println("This is palindrome number in range from 0 to " + num + " : ");
            for (int i = 1; i <= num; i++) {
                if (i % 11 == 0) {
                    System.out.printf("%d  ", i);
                }
            }
        } else {
            System.out.println("Input number in range from 0 to 100");
        }
        sc.close();
    }
}
