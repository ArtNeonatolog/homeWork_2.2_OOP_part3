import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    private static void task1() {
        System.out.println();
        System.out.println("Задание 1");

        Car car1 = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020, "Германия", "МКПП", "седан", "12345678", 5, null, new Car.Key(true, true), new Car.Insurance(LocalDate.now(), 6500.0, "987x09"));
        car1.informationOfTheCar();
        System.out.println();

        Car car2 = new Car ();
        car2.informationOfTheCar();
    }
}
