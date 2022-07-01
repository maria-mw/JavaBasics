package Java_Basics.Lesson_6.ITMO.Main;

public class Parent {
    public String field;

    public Parent(String field) {
        this.field = field;
    }

    public void print() {
        System.out.println("Method from " + this.getClass().getSimpleName() + " class");
    }
}
