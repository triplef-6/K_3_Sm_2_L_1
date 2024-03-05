package s7;

public class Pong implements Runnable {
    public Pong() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Pong");
        }
    }
}
