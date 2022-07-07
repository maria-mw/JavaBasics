package Java_Basics.Lesson_7.ITMO;

public class OuterClass {
    private int a = 2;
    private int b = 3;

    static String name = "Mike";

    void sum(final int x, final int y) {
        this.a = x;
        this.b = y;
    }

    class InnerClass {
        void display() {
            sum(4, 6);
            System.out.println("sum = " + (a + b));
        }
    }

    public static void main(String[] args) {
//        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
//        nestedStaticClass.methodNestedStaticClass();

        OuterClass outerClass = new OuterClass();
        outerClass.innerMethod();
    }

    public void innerMethod () {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.display();
    }

    static class NestedStaticClass{
        void methodNestedStaticClass () {
            System.out.println("Static nested");
            System.out.println(name);
        }
    }
}
