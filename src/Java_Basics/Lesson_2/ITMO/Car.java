package Java_Basics.Lesson_2.ITMO;

public class Car {
    private String brand;
    private String model;
    private int seatPlace;
    private Color color;
    private long price;
    private double engineCapacity;
    private boolean inNew;

    public Car(String brand, String model, Color color, boolean inNew) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.inNew = inNew;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", seatPlace=" + seatPlace +
                ", color=" + color +
                ", price=" + price +
                ", engineCapacity=" + engineCapacity +
                ", inNew=" + inNew +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeatPlace() {
        return seatPlace;
    }

    public void setSeatPlace(int seatPlace) {
        this.seatPlace = seatPlace;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isInNew() {
        return inNew;
    }

    public void setInNew(boolean inNew) {
        this.inNew = inNew;
    }
}

