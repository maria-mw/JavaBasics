package Java_Basics.Lesson_6.HW;

public class Main {
    public static void main(String[] args) {
        // 1.Human. Client and Employee & 2.Interface
        System.out.println("Tasks 1&2");
        Client client = new Client("Jhon", "Smith", "Unicredit Bank");
        BankEmployee bankEmployee = new BankEmployee("Fred", "Robertson", "Unicredit Bank");
//        System.out.println(client.toString());
        client.printInformation();
        System.out.println("======================================================");
//        System.out.println(bankEmployee.toString());
        bankEmployee.printInformation();

        // 3.Car and Truck
        System.out.println("\nTask 3");
        Car bmw = new Car(2000, "BMW X5", 'b', 220f);
        Truck scania = new Truck(5000, "Scania", 'w', 200f,8,10000);
//        System.out.println(car.toString());
        bmw.outPut();
        System.out.println("======================================================");
//        System.out.println(truck.toString());
        scania.outPut();

        // 4.Car and Truck
        System.out.println("\nTask 4");
        Bird kiwi = new Bird("Kiwi", 2, false);
        Bird pigeon = new Bird("Pigeon", 2, true);
        Dog bulldog = new Dog("Bulldog", 4, "black");
        System.out.println(kiwi.toString());
        kiwi.printLegs();
        System.out.println("======================================================");
        System.out.println(bulldog.toString());
        bulldog.printLegs();

        // 4.User.
        System.out.println("\nTask 5");
        User user = new User();
        user.newUser();
        System.out.println(user.getAge());
        System.out.println(user.toString());
        System.out.println("======================================================");

        User user1 = User.createUser();
        System.out.println(user1.getAge());
        System.out.println(user1.toString());
        System.out.println("======================================================");

        User user2 = new User();
        user2.addUser();
        System.out.println(user2.getAge());
        System.out.println(user2.toString());
        System.out.println("======================================================");


        Junior junior1 = new Junior();
        junior1.addUser();
        System.out.println(junior1.toString());
        System.out.println("======================================================");

    }
}
