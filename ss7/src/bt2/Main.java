package bt2;

public class Main {

    public static void main(String[] args) {

        double total = 1000000;

        // PercentageDiscount 10%
        OrderCalculator calculator1 =
                new OrderCalculator(new PercentageDiscount(10));

        System.out.println("So tien sau giam: " +
                calculator1.calculateFinalAmount(total));

        // FixedDiscount 50000
        OrderCalculator calculator2 =
                new OrderCalculator(new FixedDiscount(50000));

        System.out.println("So tien sau giam: " +
                calculator2.calculateFinalAmount(total));

        // NoDiscount
        OrderCalculator calculator3 =
                new OrderCalculator(new NoDiscount());

        System.out.println("So tien sau giam: " +
                calculator3.calculateFinalAmount(total));

        // HolidayDiscount 15%
        OrderCalculator calculator4 =
                new OrderCalculator(new HolidayDiscount());

        System.out.println("So tien sau giam: " +
                calculator4.calculateFinalAmount(total));
    }
}