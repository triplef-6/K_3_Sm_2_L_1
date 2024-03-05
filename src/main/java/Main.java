import s456.*;
import s123.*;
import s7.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        /*
        ArrayList<Integer> arrayList = new ArrayList<>();
        s4(arrayList);
        System.out.println(arrayList);
        */
        // 5
        /*
        ArrayList<Integer> arrayList = new ArrayList<>();
        s5(arrayList);
        System.out.println(arrayList);
        */
        // 6
        /*
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        s6(list);
        System.out.println(list);
        */
        // 7
        Thread ping = new Thread(new Ping());
        Thread pong = new Thread(new Pong());

        ping.start();
        pong.start();

        ping.join();
        pong.join();


        System.out.println("finish main thread");

    }

    public static void s4(ArrayList<Integer> arrayList) throws InterruptedException {
        Thread thread4 = new Thread(new MyClass4(arrayList));
        Thread thread5 = new Thread(new MyClass5(arrayList));


        thread4.start();
        thread5.start();

        thread4.join();
        thread5.join();

    }

    public static void s5(ArrayList<Integer> arrayList) throws InterruptedException {
        ListProcessor listProcessor1 = new ListProcessor(arrayList);
        Thread thread4 = new Thread(listProcessor1::fill);
        Thread thread5 = new Thread(listProcessor1::clear);

        thread4.start();
        thread5.start();

        thread4.join();
        thread5.join();
    }

    public static void s6(List<Integer> list) throws InterruptedException {
        ListProcessor listProcessor2 = new ListProcessor(list);
        Thread thread4 = new Thread(listProcessor2::fill);
        Thread thread5 = new Thread(listProcessor2::clear);

        thread4.start();
        thread5.start();

        thread4.join();
        thread5.join();
    }
}
