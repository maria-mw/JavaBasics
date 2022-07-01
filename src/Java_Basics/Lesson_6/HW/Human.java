package Java_Basics.Lesson_6.HW;

public abstract class Human implements PrintingInfo {
    private String name;
    private String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Human : " +
                "name = " + name +
                ", surname = " + surname;
    }
}
