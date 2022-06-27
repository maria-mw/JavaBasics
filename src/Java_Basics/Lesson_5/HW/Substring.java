package Java_Basics.Lesson_5.HW;

public class Substring {

    public static void main(String[] args) {
        //4. Number of entering the substring to the string
        System.out.println("Entered text: ");
        String text = "afafff kgwekkg бяка gkgkwek бяка kekgeag gegggg бяка";
        System.out.println(text);
        String substring = "бяка";
        System.out.println("\nSubstring = " + substring);

        Integer counter = 0;
        Boolean flag = true;
        Integer index = -1;
        while (flag) {
            index = text.indexOf(substring);
            if (index != -1) {
                counter++;
                text = text.substring(index + 4);
            } else {
                flag = false;
            }
        }
        System.out.println("\nNumber of entering of substring at the string = " + counter);

    }
}
