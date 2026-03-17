package bt2;

public class SmartHomeFacade {
    private Light light;
    private Fan fan;
    private AirConditioner ac;
    private TemperatureSensor sensor;

    public SmartHomeFacade(TemperatureSensor sensor) {
        this.light = new Light();
        this.fan = new Fan();
        this.ac = new AirConditioner();
        this.sensor = sensor;
    }

    // rời nhà
    public void leaveHome() {
        light.turnOff();
        fan.turnOff();
        ac.turnOff();
    }

    // chế độ ngủ
    public void sleepMode() {
        light.turnOff();
        ac.setTemperature(28);
        fan.setLowSpeed();
    }

    // lấy nhiệt độ
    public void getCurrentTemperature() {
        double temp = sensor.getTemperatureCelsius();
        System.out.printf("Nhiet do hien tai: %.1f°C\n", temp);
    }
}