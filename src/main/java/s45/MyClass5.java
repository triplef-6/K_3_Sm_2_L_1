package s45;

import java.util.List;

public class MyClass5 implements Runnable {
    private List<Integer> list;
    public MyClass5(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
//            int k;
//            do {
//                k = (int) (Math.random() * 10);
//            } while (k >=  list.size());

            int k = (int) (Math.random() * 20);
            if (k < list.size()) {
                list.remove(k);
            }
        }
    }
}
