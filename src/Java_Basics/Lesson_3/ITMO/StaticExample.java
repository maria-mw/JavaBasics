package Java_Basics.Lesson_3.ITMO;

public class StaticExample {
    public static final String STATIC_CONSTANT = "some constant";
    public String string;
    private static String staticString;
    private final String nonStaticString;
    protected String protectedString;
    Integer defaultInteger;

    static {
        System.out.println("===================================");
        System.out.println("static block start");
        staticString = "staticString";
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("===================================");
    }

    {
        System.out.println("===================================");
        System.out.println("non-Static block start");
        nonStaticString = "non-StaticString";
        System.out.println(staticString);
        System.out.println("non-Static block end");
        System.out.println("===================================");
    }

    public static void printStaticVar(){
        System.out.println(staticString + " in a static method");
    }

    public void printNonStaticMethod(){
        printStaticVar();
        staticString = "123";
    }

    public static void someMethod(final int x, final int y) {
        int a = x + y;
        int b = x - y;
        System.out.println("a = " + a + " b = " + b);
    }
    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        StaticExample.printStaticVar();
        Integer integer = null;
        int i = integer.parseInt("123");
        System.out.println(integer);
        System.out.println(i);
        someMethod(7,5);
    }
}
