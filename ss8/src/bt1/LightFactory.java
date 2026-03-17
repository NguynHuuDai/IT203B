package bt1;

public class LightFactory extends DeviceFactory {
    public Device createDevice() {
        System.out.println("LightFactory: Da tao den moi.");
        return new Light();
    }
}
