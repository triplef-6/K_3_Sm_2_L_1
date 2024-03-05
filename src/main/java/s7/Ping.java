package s7;

public class Ping implements Runnable {
    public Ping() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ping");
        }
    }
}
