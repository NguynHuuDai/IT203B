package btth1;

public class Main {

    public static void main(String[] args) {

        EvenRunnable evenTask = new EvenRunnable();
        OddRunnable oddTask = new OddRunnable();

        Thread thread1 = new Thread(evenTask);
        Thread thread2 = new Thread(oddTask);

        thread1.start();
        thread2.start();

        System.out.println("Thread chinh ket thuc");
    }
}