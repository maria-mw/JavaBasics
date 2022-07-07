package Java_Basics.Lesson_7.HW;

public class Main {
    public static void main(String[] args) {


        Plane plane1 = new Plane("TU", 5000, 4000);
        Plane plane2 = new Plane("IL", 3000, 2500);

        System.out.println(plane1.toString());
        System.out.println(plane2.toString());
        System.out.println("=================================================");
        System.out.println(plane1.getWing().printWeight());
        System.out.println(plane1.wingInfo());
        System.out.println("=================================================");
        System.out.println(plane2.getWing().printWeight());
        System.out.println(plane2.wingInfo());
    }

}
