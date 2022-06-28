package Java_Basics.Lesson_6.HW;

public class Bird extends Animal  {
    private Integer wings;

    public Bird(String name, Integer legs) {
        super(name, legs);
    }

    public Integer getWings() {
        return wings;
    }

    private void setWings(Integer wings) {
        this.wings = wings;
    }

    @Override
    public String toString() {
        return "Bird: " +
                " name = " + getName() +
                ", legs = " + getLegs() +
                " wings = " + getWings();
    }

    public void printLegs(){
        System.out.println(super.getLegs());
    }
}
