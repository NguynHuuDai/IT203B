package btth;

public class Main {
    public static void main(String[] args) {
        TrainStation trainStation = new TrainStation(10);

        BoxOffice boxOffice1 = new BoxOffice(trainStation, "Box Office 1");
        BoxOffice boxOffice2 = new BoxOffice(trainStation, "Box Office 2");
        BoxOffice boxOffice3 = new BoxOffice(trainStation, "Box Office 3");

        Thread thread1 = new Thread(boxOffice1);
        Thread thread2 = new Thread(boxOffice2);
        Thread thread3 = new Thread(boxOffice3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
