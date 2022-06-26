package Java_Basics.Lesson_5.HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. The longest word at the text
        String longestWord;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String string = scanner.nextLine();
        System.out.println(string);
        scanner.close();
        String [] array = string.split(" ");
        Integer wordLength = 0;
        Integer wordPosition = -1;
        for (int i = 0; i < array.length; i++) {
            if (wordLength < array[i].length()) {
                wordLength = array[i].length();
                wordPosition = i;
            }
            System.out.println(array[i]);
        }
        System.out.println("The longest word at the text is " + array[wordPosition]);
        //2. Palindrome
        //3. Change the word to the "censored"
        //4. Number of entering the substring to the string
        //5. Words inversion
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first string: ");
//        String s1 = scanner.nextLine();
//        System.out.println("Enter the second string: ");
//        String s2 = scanner.nextLine();
//        System.out.println(s1);
//        System.out.println(s2);
//        scanner.close();
    }
}
