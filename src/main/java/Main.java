import s45.*;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 3
        /*
        Thread thread1 = new Thread(new MyClass1());
        Thread thread2 = new Thread(new MyClass2());
        Thread thread3 = new Thread(new MyClass3());

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
        */

        // 4
        ArrayList<Integer> arrayList = new ArrayList<>();
        s4(arrayList);
        System.out.println(arrayList);







        System.out.println("finish main thread");

    }

    public static synchronized void s4(ArrayList<Integer> arrayList) throws InterruptedException {
        Thread thread4 = new Thread(new MyClass4(arrayList));
        Thread thread5 = new Thread(new MyClass5(arrayList));

        thread4.start();
        thread5.start();

        thread4.join();
        thread5.join();

    }
}
