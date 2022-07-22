package Java_Basics.Lesson_14.ITMO;

public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("My thread is running: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
