package Java_Basics.Lesson_6.HW;

public class Dog extends Animal  {
    private String fur;

    public Dog(String name, Integer legs, String fur) {
        super(name, legs);
        this.fur = fur;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    @Override
    public String toString() {
        return "Dog:" +
                " name = " + super.getName() +
                ", legs = " + super.getLegs() +
                ", fur = " + getFur();
    }

    public void printLegs(){
        System.out.println("Dog '" + getName() + "' have " + super.getLegs() + " legs");
    }
}
