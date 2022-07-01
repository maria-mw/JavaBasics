package Java_Basics.Lesson_6.HW;

public class Bird extends Animal  {
    private Boolean wings;

    public Bird(String name, Integer legs, Boolean wings) {
        super(name, legs);
        this.wings = wings;
    }

    public Boolean getWings() {
        return wings;
    }

    private void setWings(Boolean wings) {
        this.wings = wings;
    }


    @Override
    public String toString() {
        return "Bird: " +
                " name = " + super.getName() +
                ", legs = " + super.getLegs() +
                ", wings = " + getWings();
    }

    public void printLegs(){
        System.out.println("Bird '" + getName() + "' have " + super.getLegs() + " legs");
    }
}
