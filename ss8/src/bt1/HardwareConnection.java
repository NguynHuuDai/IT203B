package bt1;

public class HardwareConnection {
    private static HardwareConnection instance;
    private boolean isConnected = false;

    private HardwareConnection() {}

    public static HardwareConnection getInstance() {
        if (instance == null) {
            instance = new HardwareConnection();
        }
        return instance;
    }

    public void connect() {
        if (!isConnected) {
            System.out.println("HardwareConnection: Da ket noi phan cung.");
            isConnected = true;
        }
    }

    public void disconnect() {
        if (isConnected) {
            System.out.println("HardwareConnection: Da ngat ket noi.");
            isConnected = false;
        }
    }
}