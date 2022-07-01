package Java_Basics.Lesson_6.ITMO.Main;

public class Plane extends Transport {
    public Plane(Integer weight, Integer seatPlace, Boolean isFlying) {
        super(weight, seatPlace, isFlying);
    }

    @Override
    void abstractMethod() {
        System.out.println("abstract Method");
    }

    @Override
    public void printTransportInfo() {

    }
}
