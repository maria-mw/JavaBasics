package Java_Basics.Lesson_14.ITMO;

public class ThreadExample extends Thread{
    public ThreadExample() {
        this.start();
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " passes itself queue to the next thread ");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " finished executing");

    }
}
