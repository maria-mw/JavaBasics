package Java_Basics.Lesson_14.HW;

import java.util.concurrent.CountDownLatch;

public class Task3 {
    public static final Object monitor = new Object();
    public static final String nameA = "nameA";
    public static final String nameB = "nameB";
    public static final String nameC = "nameC";
    public static String currentString = "nameA";

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(15);

        new Thread(() -> {
            synchronized (monitor) {
                for (int i = 0; i < 10; i++) {
                    try {
                        while (!currentString.equals(nameA)) {
                            monitor.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(nameA);
                    currentString = nameB;
                    countDownLatch.countDown();
                    monitor.notifyAll();
                }
            }
        }).start();


        new Thread(() -> {
            synchronized (monitor) {
                for (int i = 0; i < 10; i++) {
                    try {
                        while (!currentString.equals(nameB)) {
                            monitor.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(nameB);
                    currentString = nameC;
                    countDownLatch.countDown();
                    monitor.notifyAll();
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (monitor) {
                for (int i = 0; i < 10; i++) {
                    try {
                        while (!currentString.equals(nameC)) {
                            monitor.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(nameC);
                    currentString = nameA;
                    countDownLatch.countDown();
                    monitor.notifyAll();
                }
            }
        }).start();


    }
}
