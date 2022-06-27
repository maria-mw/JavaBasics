package Java_Basics.Lesson_4.ITMO;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        long [] l = new long [] {123L, 321L,332L};
        int [] array = {123, 321,332};
        System.out.println(Arrays.toString(l));
//        fori
        for (int i = 0; i <l.length ; i++) {

        }
//        iter
        for (long l1 : l) {

        }


//        Arrays.sort(array, Collections.reverseOrder());
        varargMethod("qwerty");
        varargMethod("qwerty","dgg","youyo");
    }

    public static void varargMethod(String... line){
        System.out.println(Arrays.toString(line));
    }
}
