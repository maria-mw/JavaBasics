package Java_Basics.Lesson_6.HW;

public class Car {
    private Integer weight;
    private String model;
    private Character color;
    private Float speed;

    public Car(Integer weight, String model, Character color, Float speed) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public Car() {
    }

    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + " кг.");
        System.out.println("Цвет машины - " + color + " и ее скорость - " + speed + " км/ч");
    }

    public int getWeight() {
        return weight;
    }

    private void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public char getColor() {
        return color;
    }

    private void setColor(Character color) {
        this.color = color;
    }

    public float getSpeed() {
        return speed;
    }

    private void setSpeed(Float speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car:" +
                " model = " + model +
                ", weight = " + weight +
                ", color = " + color +
                ", speed = " + speed ;
    }
}
