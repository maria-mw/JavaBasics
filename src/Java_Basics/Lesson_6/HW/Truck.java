package Java_Basics.Lesson_6.HW;

public class Truck extends Car {
    private Integer wheelsNumber;
    private Integer maxWeight;

    public Truck(Integer weight, String model, Character color, Float speed, Integer wheelsNumber, Integer maxWeight) {
        super(weight, model, color, speed);
        this.wheelsNumber = wheelsNumber;
        this.maxWeight = maxWeight;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    private void setWheelsNumber(Integer wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    private void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Truck: " +
                "model = " + getModel() +
                ", weight = " + getWeight() +
                ", color = " + getColor() +
                ", speed = " + getSpeed() +
                ",wheelsNumber = " + wheelsNumber +
                ", maxWeight = " + maxWeight;
    }

    public void newWheels(Integer wheelsNumber) {
        setWheelsNumber(wheelsNumber);
        System.out.println(wheelsNumber);
    }

    @Override
    public void outPut() {
        System.out.println("Вес " + getModel() + " составляет " + getWeight() + " кг.");
        System.out.println("Цвет грузовика - " + getColor() + " и его скорость - " + getSpeed() + " км/ч");
        System.out.println("Число колес у грузовика " + wheelsNumber);
        System.out.println("Максимальный вес - " + maxWeight + " кг");
    }
}
