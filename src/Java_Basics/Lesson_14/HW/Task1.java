package Java_Basics.Lesson_14.HW;

public class Task1 {

    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getState());

//        Thread[] threads = new Thread[10];

        for (int j = 0; j < 10; j++) {
//            threads[j] =
                    new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println(Thread.currentThread().getName());
//                    System.out.println(Thread.currentThread().getState());
                }
            }).start();
        }
//        for (Thread thread : threads) {
//            thread.start();
//        }
    }
}
