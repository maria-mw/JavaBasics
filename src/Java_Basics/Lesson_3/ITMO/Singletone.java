package Java_Basics.Lesson_3.ITMO;

public class Singletone {
    private static Singletone instance;
    private Singletone(){

    }

    public static Singletone getInstance() {
        if (instance == null) {
            instance = new Singletone();
        }
        return instance;
    }
}
