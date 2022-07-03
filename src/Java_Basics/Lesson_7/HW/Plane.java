package Java_Basics.Lesson_7.HW;

public class Plane {
    private String model;
    private Integer flightDistance;
    private Wing wing;

    public Plane(String model, Integer flightDistance, Wing wing) {
        this.model = model;
        this.flightDistance = flightDistance;
        this.wing = wing;
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public Integer getFlightDistance() {
        return flightDistance;
    }

    private void setFlightDistance(Integer flightDistance) {
        this.flightDistance = flightDistance;
    }

    public Wing getWing() {
        return wing;
    }

    private void setWing(Wing wing) {
        this.wing = wing;
    }

    @Override
    public String toString() {
        return "Plane: " +
                "model = '" + model +
                "', flightDistance = " + flightDistance +
                " km, wing " + wing + " kg";
    }

    String wingInfo () {
        return "Plane '" + getModel() + "'; " + wing.printWeight();
    }
}
