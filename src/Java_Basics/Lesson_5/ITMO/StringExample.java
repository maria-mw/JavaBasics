package Java_Basics.Lesson_5.ITMO;

public class StringExample {
    public static void main(String[] args) {
        String java = "Java";
//        String s = java.toLowerCase();
        String java2 = "JaVa";

        System.out.println(java == java2);
        System.out.println(java.equals(java2));
        System.out.println(java.equalsIgnoreCase(java2));
        java = java.concat(" Developer");
        java = java + 123;
        System.out.println(java);

        String java3 = 80 + 120 + java2 + 140 + 160;
        String java4 = 80 + 120 + java2 + (140 + 160);
        System.out.println(java4);

        boolean empty = java.isEmpty();
        System.out.println(java.substring(2));
        System.out.println(java.substring(2,6));
        String string = " Hello world! ";
        System.out.println(string);
        System.out.println(string.trim());

        System.out.println(string.replaceAll("l","5"));

        String text = "Допустим, мы делаем программу для обслуживания банковских операций";
//        String [] strings1 = text.split(" ");
//        for (String str: strings1) {
//            System.out.println(str);
//        }
//
//        Integer number = 12345;
//        String str = String.valueOf(number);
//
//        str.startsWith("1");

        StringBuilder builder1 = new StringBuilder(text);
        StringBuilder builder2 = new StringBuilder(text);
        StringBuilder builder = new StringBuilder();
        System.out.println(builder1);

        System.out.println(text == builder1.toString());
        System.out.println(builder1 == builder2);
        System.out.println(builder1.equals(builder2));
        System.out.println(text.equals(builder1.toString()));
        System.out.println(text.equals(builder1));
        System.out.println();

        for (String str : text.split(" ")) {
            builder.append(str)
                    .append(", ");
        }

        System.out.println();
        System.out.println(builder);

        String text1 = builder.reverse().toString();
        System.out.println(string);

        builder.insert(3,"MOSCOW");
        System.out.println(builder);

        StringBuffer stringBuffer = new StringBuffer(); // потокобезопасный
    }
}
