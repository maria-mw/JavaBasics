package Java_Basics.Lesson_3.HW;

public class Car {
    private String brand;
    private CarColor color;
    private Double weight;

    public Car(String brand, CarColor color, Double weight) {
        this.brand = brand;
        this.color = color;
        this.weight = weight;
    }

    public Car(CarColor color) {
        this.color = color;
    }

    public Car(CarColor color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarColor getCarColor() {
        return color;
    }

    public void setCarColor(CarColor color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "brand = " + brand +
                ", color = " + color +
                ", weight= " + weight;
    }
}
