package bt1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HardwareConnection connection = HardwareConnection.getInstance();
        List<Device> devices = new ArrayList<>();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ket noi phan cung");
            System.out.println("2. Tao thiet bi");
            System.out.println("3. Bat thiet bi");
            System.out.println("4. Tat thiet bi");
            System.out.println("5. Thoat");
            System.out.print("Chon: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    connection.connect(); // Singleton test
                    break;

                case 2:
                    System.out.println("Chon loai: 1. Den  2. Quat  3. Dieu hoa");
                    int type = sc.nextInt();

                    DeviceFactory factory = null;

                    if (type == 1) factory = new LightFactory();
                    else if (type == 2) factory = new FanFactory();
                    else if (type == 3) factory = new AirConditionerFactory();

                    if (factory != null) {
                        Device d = factory.createDevice();
                        devices.add(d);
                    }
                    break;

                case 3:
                    if (devices.isEmpty()) {
                        System.out.println("Chua co thiet bi!");
                        break;
                    }

                    for (int i = 0; i < devices.size(); i++) {
                        System.out.println((i + 1) + ". Thiet bi " + (i + 1));
                    }

                    System.out.print("Chon: ");
                    int onIndex = sc.nextInt();
                    devices.get(onIndex - 1).turnOn();
                    break;

                case 4:
                    if (devices.isEmpty()) {
                        System.out.println("Chua co thiet bi!");
                        break;
                    }

                    for (int i = 0; i < devices.size(); i++) {
                        System.out.println((i + 1) + ". Thiet bi " + (i + 1));
                    }

                    System.out.print("Chon: ");
                    int offIndex = sc.nextInt();
                    devices.get(offIndex - 1).turnOff();
                    break;

                case 5:
                    System.out.println("Thoat...");
                    return;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}