package btth1;

public class EvenRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 2; i <= 10; i += 2) {

            System.out.println("So chan: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}