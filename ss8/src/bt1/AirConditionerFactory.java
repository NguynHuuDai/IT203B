package bt1;

public class AirConditionerFactory extends DeviceFactory {
    public Device createDevice() {
        System.out.println("AirConditionerFactory: Da tao dieu hoa moi.");
        return new AirConditioner();
    }
}