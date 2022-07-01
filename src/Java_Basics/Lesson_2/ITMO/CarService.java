package Java_Basics.Lesson_2.ITMO;

public class CarService {
    private Car car;

    public static long totalPrice(Car car, Integer servicePrice) {
        return car.getPrice() + servicePrice;
    }
}

