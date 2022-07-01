package Java_Basics.Lesson_6.ITMO.Main;

public class Bus implements Movable {
    @Override
    public void printTransportInfo() {
        System.out.println(transportName());
    }

    @Override
    public String transportName() {
        return "Scania";
    }
}
