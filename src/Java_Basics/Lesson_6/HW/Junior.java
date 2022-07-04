package Java_Basics.Lesson_6.HW;

public class Junior extends User {
    public Junior() {
    }

    public void newJunior() {
        setName("Jane");
        setSurname("Dow");
        setAge(25);
        setGender(Gender.FEMALE);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public Enum getGender() {
        return super.getGender();
    }

    @Override
    public void newUser() {
        super.newUser();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public void setAge(Integer age) {
        super.setAge(age);
    }

    @Override
    public void setGender(Enum gender) {
        super.setGender(gender);
    }

    @Override
    public Integer setAge() {
        return super.setAge();
    }

    @Override
    public void setUserName(String name) {
        super.setUserName(name);
    }

    @Override
    public String toString() {
        return "Junior: " +
                "name = '" + getName() + '\'' +
                ", surname = '" + getSurname() + '\'' +
                ", age = " + getAge() +
                ", gender = " + getGender();
    }

    @Override
    public void addUser() {
        super.addUser();
    }

    @Override
    public void getInfo() {
        System.out.println("Enter name:");
        setUserName(scanner.next());
        System.out.println("Name is " + this.getName());
    }
}
