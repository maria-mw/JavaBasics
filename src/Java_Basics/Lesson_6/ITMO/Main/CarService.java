package Java_Basics.Lesson_6.ITMO.Main;

public class CarService {
    private Car car;

    public static long totalPrice(Car car, Integer servicePrice) {
        return car.getPrice() + servicePrice;
    }
}

