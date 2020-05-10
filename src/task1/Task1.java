/*Создать программу, которая будет сообщать, является ли целое число,
        введенное пользователем, чётным или нечётным, простым или составным.
        Если пользователь введёт не целое число, то сообщать ему об ошибке.*/

package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        boolean isSimple = true;
        boolean isOdd = true;
        System.out.print("Input number: ");

        try {
            number = sc.nextInt();
            if (Math.abs(number) > 2 && (number % 2 == 0)) {
                isSimple = false;
                isOdd = false;
            } else {
                for (int i = 2; i * i <= Math.abs(number); i++) {
                    if (number % i == 0) {
                        isSimple = false;
                    }
                }
            }
            System.out.printf("The number: %d is odd - %b, is simple - %b", number, isOdd, isSimple);
        } catch (InputMismatchException e) {
            System.out.println("Need an integer number");
        } finally {
            sc.close();
        }
    }
}
