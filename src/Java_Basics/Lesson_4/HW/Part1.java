package Java_Basics.Lesson_4.HW;

import java.util.Arrays;
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        // PART # 1
        //1. Odd numbers from 1 to 99
        System.out.println("Odd numbers from 1 to 99:");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n========================================================================");

        //2. Numbers divided by 3, 5, 3 and 5
        System.out.println("Numbers divided by 3:");
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n========================================================================");
        System.out.println("Numbers divided by 5:");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n========================================================================");
        System.out.println("Numbers divided by 3 and 5:");
        for (int i = 0; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n========================================================================");


        //3. True if number1 + number2 = number3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number #1: ");
        Integer number1 = scanner.nextInt();
        System.out.print("Enter number #2: ");
        Integer number2 = scanner.nextInt();
        System.out.print("Enter number #3: ");
        Integer number3 = scanner.nextInt();

        if (number1 + number2 == number3) {
            System.out.println("\n" + "True. Number #1 + Number #2 = Number #3.\n"
                    + number1 + " + " + number2 + " = " + number3);
        } else {
            System.out.println("Numbers don't meet the condition (Condition is number1 + number2 = number3)");
        }
        System.out.println("========================================================================");

        //4. True if number2 > number1 and number3 > number2
        System.out.print("Enter number #1: ");
        Integer number_1 = scanner.nextInt();
        System.out.print("Enter number #2: ");
        Integer number_2 = scanner.nextInt();
        System.out.print("Enter number #3: ");
        Integer number_3 = scanner.nextInt();

        if ((number_2 > number_1) && (number_3 > number_2)) {
            System.out.println("\n" + "True. Number #2 > Number #1 and Number #3 > Number #2/\n"
                    + number_2 + " > " + number_1 + " and "
                    + number_3 + " > " + number_2);
        } else {
            System.out.println("Numbers don't meet the condition (Condition is number2 > number1 and number3 > number2)");
        }
        System.out.println("========================================================================");

        //5. True if first or last element of array is equal 3
        Integer[] array = Part2.arrayCreation(10);
        System.out.println(Arrays.toString(array));
        if (array[0] == 3) {
            System.out.println("True. First element of array is equal 3");
        } else if (array[array.length - 1] == 3) {
            System.out.println("True. Last element of array is equal 3");
        } else {
            System.out.println("First or last elements of array aren't equal 3");
        }
        System.out.println("========================================================================");

        //6. True if the array contains 1 or 3
        Integer[] myArray = Part2.arrayCreation(10);
        boolean flag = false;
        System.out.println(Arrays.toString(myArray));
        for (Integer number : myArray) {
            if ((number == 1) || (number == 3)) {
                System.out.println("True. Array contains numbers 1 or 3");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Array doesn't contain numbers 1 or 3");
        }

        scanner.close();
    }
}
