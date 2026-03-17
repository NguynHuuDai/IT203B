package bt1;

public class Light implements Device {
    public void turnOn() {
        System.out.println("Den: Bat sang.");
    }

    public void turnOff() {
        System.out.println("Den: Tat.");
    }
}