/*Создать программу, которая будет вычислять и выводить на экран
        НОК (наименьшее общее кратное) и НОД (наибольший общий делитель)
        двух целых чисел, введенных пользователем.
        Если пользователь некорректно введёт хотя бы одно
        из чисел, то сообщать об ошибке.*/

package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum;
        int secondNum;

        try {
            System.out.print("Input first integer number: ");
            firstNum = sc.nextInt();
            System.out.print("Input second integer number: ");
            secondNum = sc.nextInt();

            int resNod = new Nod().calcNod(firstNum, secondNum);
            int resNok = new Nok().calcNok(firstNum, secondNum);
            System.out.printf("NOD(%d, %d) = %d", firstNum, secondNum, resNod);
            System.out.printf("\nNOK(%d, %d) = %d", firstNum, secondNum, resNok);
        } catch (InputMismatchException e) {
            System.out.println("Need two integer number");
        } finally {
            sc.close();
        }
    }
}

