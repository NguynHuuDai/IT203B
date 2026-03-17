package bt2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // dùng cảm biến cũ qua adapter
        OldThermometer oldThermometer = new OldThermometer();
        TemperatureSensor sensor = new ThermometerAdapter(oldThermometer);

        SmartHomeFacade facade = new SmartHomeFacade(sensor);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Xem nhiet do");
            System.out.println("2. Roi nha");
            System.out.println("3. Che do ngu");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    facade.getCurrentTemperature();
                    break;
                case 2:
                    facade.leaveHome();
                    break;
                case 3:
                    facade.sleepMode();
                    break;
                case 4:
                    System.out.println("Thoat...");
                    return;
                default:
                    System.out.println("Khong hop le!");
            }
        }
    }
}