package Java_Basics.Lesson_3.ITMO;

public class MyMain {
    public static void main(String[] args) {
        Sun sun = Sun.getSun();
        sun.setSize(123);
        sun.setColor("White");


        Sun sun2 = Sun.getSun();
        sun2.setSize(234);
        sun2.setColor("Yellow");
        System.out.println(sun);
        System.out.println(sun2);
    }
}
