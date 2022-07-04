package Java_Basics.Lesson_9.HW;

import java.util.Objects;

public class Car implements Comparable<Car>{
    String brand;
    Integer number;

    public Car(String brand, Integer number) {
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

//    @Override
//    public int compare(Car o1, Car o2) {
//        if (o1.number > o2.number) {
//            return 1;
//        } else if (o1.number < o2.number) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, number);
    }

    @Override
    public String toString() {
        return "Car: " +
                "brand  ='" + brand + '\'' +
                ", number = " + number;
    }

    @Override
    public int compareTo(Car o) {
        if (this.number > o.number) {
            return 1;
        } else if (this.number < o.number) {
            return -1;
        } else {
            return 0;
        }

//        return this.brand.compareTo(o.brand);
    }
}
