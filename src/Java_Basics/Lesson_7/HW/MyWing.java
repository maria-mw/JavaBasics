package Java_Basics.Lesson_7.HW;

public class MyWing {
    private Integer weight;

    public MyWing(Integer weight) {
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

    String printWeight(){
        return ("Wing weight is " + this.weight + " kg");
    }
}
