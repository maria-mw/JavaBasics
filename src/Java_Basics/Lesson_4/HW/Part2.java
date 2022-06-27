package Java_Basics.Lesson_4.HW;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {

        // 1. True if array is sorted by increasing
//        Integer [] array1 = {1,3,5};
        Integer[] array1 = arrayCreation(10);
        System.out.println(Arrays.toString(array1));
        int i = 0;
        boolean increasingSorted = false;
        while (i < array1.length - 1) {
            if ((array1[i]) > array1[i + 1]) {
                increasingSorted = true;
                break;
            } else {
                i++;
            }
        }
        String text = increasingSorted ?
                "Array isn't sorted by increasing. Please, try again" : "OK. Array is sorted by increasing";
        System.out.println(text);
        System.out.println("========================================================================");

        // 2. Creation an array with length and elements entered from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        try {
            Integer arrayLength = scanner.nextInt();
            Integer[] array2 = new Integer[arrayLength];
            for (int j = 0; j < arrayLength; j++) {
                System.out.print("Enter number #" + (j + 1) + ": ");
                array2[j] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(array2));
        } catch (Exception e) {
            System.out.println("Array length should be positive number");
        }
        System.out.println("========================================================================");

        // 3. Replacing first and last elements of array
//        Integer [] array3 = {2,2,9,3,9,2,2,4,3};
        Integer[] array3 = arrayCreation(10);
        System.out.println("Original array");
        System.out.println(Arrays.toString(array3));
        Integer firstElement = array3[0];
        array3[0] = array3[array3.length - 1];
        array3[array3.length - 1] = firstElement;
        System.out.println("First and last elements of array are replaced");
        System.out.println(Arrays.toString(array3));
        System.out.println("========================================================================");

        // 4. First unique number at the array
////        Integer [] array4 = {5,5,5};
////        Integer [] array4 = {2,2,9,3,9,2,2,4,3};
        Integer[] array4 = arrayCreation(10);
        System.out.println("Original array");
        System.out.println(Arrays.toString(array4));
        Integer uniqueNumber = null;

        boolean flag;
        int j = 0;
        while (j < array4.length) {
            flag = true;
            int k = 0;
            Integer currentNumber = array4[j];
            while (k < array4.length) {
                if (currentNumber.equals(array4[k]) && (k != j)) {
                    flag = false;
                    break;
                }
                k++;
            }
            if (flag) {
                uniqueNumber = currentNumber;
                break;
            } else {
                j++;
            }
        }
        if (uniqueNumber == null) {
            System.out.println("There is no unique number at the array");
        } else {
            System.out.println("First unique number is " + uniqueNumber);
        }
        System.out.println("========================================================================");

        // 5. Merge sort
        Integer[] array5 = arrayCreation(10);
//        Integer[] array5 = {3, 9, 8, 5, 3, 4, 6};
        System.out.println("Original array");
        System.out.println(Arrays.toString(array5));
        mergeSort(array5, 0, array5.length);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array5));
        System.out.println("========================================================================");
    }


    public static void mergeSort(Integer[] array, Integer startIndex, Integer endIndex) {
        if (endIndex - startIndex < 2) {
            return;
        }
        Integer middleIndex = (startIndex + endIndex) / 2;
        mergeSort(array, startIndex, middleIndex);
        mergeSort(array, middleIndex, endIndex);
        merge(array, startIndex, middleIndex, endIndex);
    }

    public static void merge(Integer[] array, Integer startIndex, Integer middleIndex, Integer endIndex) {
        if (array[middleIndex - 1] <= array[middleIndex]) {
            return;
        }
        Integer i = startIndex;
        Integer j = middleIndex;
        Integer tempIndex = 0;
        Integer[] tempArray = new Integer[endIndex - startIndex];
        while (i < middleIndex && j < endIndex) {
            tempArray[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        System.arraycopy(array, i, array, startIndex + tempIndex, middleIndex - i);
        System.arraycopy(tempArray, 0, array, startIndex, tempIndex);
    }

    public static Integer[] arrayCreation(Integer maxArrayValue) {
        int arrayLength = (int) (Math.random() * maxArrayValue + 1);
        Integer[] array = new Integer[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * maxArrayValue);
        }
        return array;
    }
}
