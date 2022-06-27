package Java_Basics.Lesson_5.HW;

public class CensoredString {
    public static void main(String[] args) {
        //3. Change the word "бяка' to the "censored"
        System.out.println("Original string: ");
        String text = "бякаafafffбяка бяка kgwekkg gkgkwek бяка kekgeag gegggg бяка";
//        String text = "afafff kgwekkg gkgkwek kekgeag gegggg";
        System.out.println(text);
        String substring = "бяка";
        String censoredString = "";
        String CENSORED_STATEMENT = "[вырезано цензурой]";
        Boolean flag = true;
        Integer index = -1;
        while (flag) {
            index = text.indexOf(substring);
            if (index != -1) {
                censoredString += text.substring(0, index) + CENSORED_STATEMENT;
                text = text.substring(index + 4);
            } else {
                censoredString = censoredString + text;
                flag = false;
            }
        }
        System.out.println("\nCensored string:");
        System.out.println(censoredString);
    }
}
