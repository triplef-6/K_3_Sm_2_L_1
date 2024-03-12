package T123;

public class MyClass1 implements Runnable {
    public MyClass1() {
    }

    @Override
    public void run() {
        System.out.println( "1: " + Thread.currentThread() + " " + Thread.currentThread().getState());
    }
}
