package Java_Basics.Lesson_6.ITMO.Main;

public class Child extends Parent{
    public Child(String field) {
        super(field);
    }

    @Override
    public void print() {
        System.out.println("Child method");
    }

    public void someMethod() {
        String field = super.field;
    }
}
