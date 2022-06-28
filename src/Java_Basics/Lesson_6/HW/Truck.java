package Java_Basics.Lesson_6.HW;

public class Truck extends Car {
    public int wheelsNumber;
    public double maxWeight;

    public Truck(int weight, String model, char color, float speed, int wheelsNumber, double maxWeight) {
        super(weight, model, color, speed);
        this.wheelsNumber = wheelsNumber;
        this.maxWeight = maxWeight;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    private void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    private void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Truck :" +
                " model = " + model +
                ", weight = " + weight +
                ", color = " + color +
                ", speed = " + speed +
                ",wheelsNumber = " + wheelsNumber +
                ", maxWeight = " + maxWeight;
    }

    public void newWheels(int wheelsNumber) {
        setWheelsNumber(wheelsNumber);
        System.out.println(wheelsNumber);
    }
}
