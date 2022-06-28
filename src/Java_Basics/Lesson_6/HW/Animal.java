package Java_Basics.Lesson_6.HW;

public class Animal {
    private String name;
    private Integer legs;

    public Animal(String name, Integer legs) {
        this.name = name;
        this.legs = legs;
    }

    public Integer getLegs() {
        return legs;
    }

    private void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal:" +
                " name = " + name +
                ", legs= " + legs;
    }
}
