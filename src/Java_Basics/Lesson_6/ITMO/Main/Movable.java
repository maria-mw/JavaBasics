package Java_Basics.Lesson_6.ITMO.Main;

public interface Movable {
    public static final String NAME = "Brand";
    public abstract void printTransportInfo();
    public abstract String transportName();
    default void someMethod(){
        System.out.println("someMethod");
    }
    public static void staticMethod(){
        //logic
    }
}
