package btth;

public class BoxOffice implements Runnable {

    private TrainStation trainStation;
    private String name;

    public BoxOffice(TrainStation trainStation, String name) {
        this.trainStation = trainStation;
        this.name = name;
    }

    @Override
    public void run() {
        while (trainStation.getQuantity() > 0) {
            trainStation.sellTicket(name);

        }
    }
}
