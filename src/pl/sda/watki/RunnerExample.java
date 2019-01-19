package pl.sda.watki;

public class RunnerExample extends Thread {
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
