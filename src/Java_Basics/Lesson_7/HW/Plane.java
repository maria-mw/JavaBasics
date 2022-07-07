package Java_Basics.Lesson_7.HW;

public class Plane {
    private String model;
    private Integer flightDistance;
    private Wing wing;

    public Plane(String model, Integer flightDistance, Integer wingWeight) {
        this.model = model;
        this.flightDistance = flightDistance;
        this.wing = new Wing(wingWeight);
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

    class Wing {
        private Integer weight;

        public Wing(Integer weight) {
            this.weight = weight;
        }

        public Integer getWeight() {
            return weight;
        }

        private void setWeight(Integer weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "weight = " + weight;
        }

        String printWeight() {
            return ("Wing weight is " + this.weight + " kg");
        }
    }
}
