package bt4;

public class Humidifier implements Observer {

    public Humidifier() {
        System.out.println("May tao am: Da dang ky");
    }

    public void update(int temperature) {
        System.out.println("May tao am: Dieu chinh do am cho nhiet do " + temperature);
    }
}
