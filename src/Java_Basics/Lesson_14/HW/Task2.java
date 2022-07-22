package Java_Basics.Lesson_14.HW;

public class Task2 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[100];
        Counter counter = new Counter();

        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        counter.increment();
                    }
                }
            });
        }

        startThreads(threads);
        System.out.println(counter.getCount());
    }

    public static void startThreads(Thread[] threads) {
        for (Thread thread: threads) {
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
