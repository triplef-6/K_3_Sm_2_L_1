package s45;

import java.util.List;

public class MyClass4 implements Runnable {
    private List<Integer> list;
    public MyClass4(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            list.add((int) (Math.random() * 10000));
        }
    }
}
