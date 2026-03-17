package bt4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TemperatureSensor sensor = new TemperatureSensor();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Dang ky quat");
            System.out.println("2. Dang ky may tao am");
            System.out.println("3. Set nhiet do");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Fan fan = new Fan();
                    sensor.attach(fan);
                    break;

                case 2:
                    Humidifier h = new Humidifier();
                    sensor.attach(h);
                    break;

                case 3:
                    System.out.print("Nhap nhiet do: ");
                    int temp = sc.nextInt();
                    sensor.setTemperature(temp);
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