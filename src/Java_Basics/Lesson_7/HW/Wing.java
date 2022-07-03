package Java_Basics.Lesson_7.HW;

public class Wing {
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

    String printWeight(){
        return ("Wing weight is " + this.weight + " kg");
    }
}
