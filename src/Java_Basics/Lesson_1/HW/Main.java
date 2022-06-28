package Java_Basics.Lesson_1.HW;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//  Пункт 1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java. \n");

//  Пункт 2
        System.out.println((46 + 10) * (10d / 3));
        System.out.println(29 * 4 * (-15));

//  Пункт 3
        double number = 10500d;
        double result = number / 10 / 10;
        System.out.println("\n" + result);

//  Пункт 4
        double number1 = 3.6d;
        double number2 = 4.1d;
        double number3 = 5.9d;
        double resultMultiplic = number1 * number2 * number3;
        System.out.println("\n" + resultMultiplic);

//  Пункт 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите третье число:");
        int thirdNumber = scanner.nextInt();
        System.out.println(firstNumber + "\n" + secondNumber + "\n" + thirdNumber + "\n");

//  Пункт 6
        System.out.println("Введите число:");
        int myNumber = scanner.nextInt();
        if (myNumber % 2 == 1) {
            System.out.println("Нечетное");
        } else if (myNumber <= 100) {
            System.out.println("Четное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }
    }

}
