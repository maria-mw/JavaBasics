package Java_Basics.Lesson_6.HW;

import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private Integer age;
    private Enum gender;

    private User(String name, String surname, Integer age, Enum gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public User() {
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

    public Integer getAge() {
        return age;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    public Enum getGender() {
        return gender;
    }

    private void setGender(Enum gender) {
        this.gender = gender;
    }

    public void newUser() {
        this.name = "Tim";
        this.surname = "Wilson";
        this.age = setAge();
        this.gender = Gender.MALE;
    }

    public Integer setAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter age:");
        int age = scanner.nextInt();
        if (age < 0 || age > 125) {
            age = 0;
        }

        return age;
    }

    public String setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter name:");
        String name = scanner.nextLine();
        scanner.nextLine();
        return name;
    }

    public static User createUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter name:");
        String name = scanner.nextLine();
        System.out.println("Please, enter surname:");
        String surname = scanner.nextLine();
        System.out.println("Please, enter age:");
        int age = scanner.nextInt();
        if (age < 0 || age > 125) {
            age = 0;
        }
        System.out.println("Please, enter gender: for male  / female");
        System.out.println("For male put - m;\nfor female - f");

        Gender gender = null;
        char tmpGender = scanner.next().charAt(0);
        switch (tmpGender) {
            case 'm':
                gender = Gender.MALE;
                break;

            case 'f':
                gender = Gender.FEMALE;
                break;

            default:
                System.out.println("Wrong input");
        }
        return new User(name, surname, age, gender);
    }

    public void addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter name:");
        String name = scanner.nextLine();
        System.out.println("Please, enter surname:");
        String surname = scanner.nextLine();
        System.out.println("Please, enter age:");
        int age = scanner.nextInt();
        if (age < 0 || age > 125) {
            age = 0;
        }
        System.out.println("Please, enter gender: for male  / female");
        System.out.println("For male put - m;\nfor female - f");

        Gender gender = null;
        char tmpGender = scanner.next().charAt(0);
        switch (tmpGender) {
            case 'm':
                gender = Gender.MALE;
                break;

            case 'f':
                gender = Gender.FEMALE;
                break;

            default:
                System.out.println("Wrong input");
        }

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "User:" +
                " name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", gender = " + gender;
    }
}
