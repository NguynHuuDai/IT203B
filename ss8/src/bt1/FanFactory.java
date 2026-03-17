package bt1;

public class FanFactory extends DeviceFactory {
    public Device createDevice() {
        System.out.println("FanFactory: Da tao quat moi.");
        return new Fan();
    }
}