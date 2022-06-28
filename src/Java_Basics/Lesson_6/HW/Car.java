package Java_Basics.Lesson_6.HW;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;

    public Car(int weight, String model, char color, float speed) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public Car() {
    }

    public void outPut() {
        System.out.println("Вес " + model + " состовляет " + weight + " кг.");
        System.out.println("Цвет машины - " + color + " и ее скорость - " + speed);
    }

    public int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
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

    private void setColor(char color) {
        this.color = color;
    }

    public float getSpeed() {
        return speed;
    }

    private void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car : " +
                " model = " + model +
                ", weight = " + weight +
                ", color = " + color +
                ", speed = " + speed ;
    }
}
