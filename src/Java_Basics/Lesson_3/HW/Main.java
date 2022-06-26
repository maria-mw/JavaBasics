package Java_Basics.Lesson_3.HW;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", CarColor.BLUE, 2500.0);
        Car car2 = new Car(CarColor.BLACK, 1500.0);
        Car car3 = new Car(CarColor.SILVER);
        Car car4 = new Car();
        System.out.println("Car #1: " + car1);
        System.out.println("Car #2: " + car2);
        System.out.println("Car #3: " + car3);
        System.out.println("Car #4: " + car4);
        System.out.println();

        Building building1 = new Building();
        Building building2 = new Building();
        building1.setNumberOfFloors(5);
        building1.setConstructionYear(2000);
        building1.setTitle(BuildingTitle.PANEL);
        building2.setNumberOfFloors(25);
        building2.setConstructionYear(2018);
        building2.setTitle(BuildingTitle.BRICK);
        System.out.println("Building #1: " + building1);
        System.out.println("Building #2: " + building2);
        System.out.println(building1.yearsFromConstruction() + " years passed from construction date of building #1");
        System.out.println(building2.yearsFromConstruction() + " years passed from construction date of building #2");
        System.out.println();

        Tree tree1 = new Tree(25, true, "Birch");
        Tree tree2 = new Tree(37, "Pine");
        Tree tree3 = new Tree();
        System.out.println("Tree #1: " + tree1);
        System.out.println("Tree #2: " + tree2);
        System.out.println("Tree #3: " + tree3);

    }
}
