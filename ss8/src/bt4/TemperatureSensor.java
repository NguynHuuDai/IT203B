package bt4;

import java.util.*;

public class TemperatureSensor implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    public void attach(Observer o) {
        observers.add(o);
        System.out.println("Da dang ky thiet bi.");
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("\nCam bien: Nhiet do = " + temp);
        notifyObservers();
    }
}
