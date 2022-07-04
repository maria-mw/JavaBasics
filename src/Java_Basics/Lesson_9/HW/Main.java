package Java_Basics.Lesson_9.HW;

import java.util.*;

public class Main {
    //For Task 1
    public static List<Car> carList = new ArrayList<>();
    public static Set<Car> carSet = new TreeSet<>();

    // For Task 2
    public static List<Integer> arrayList = new ArrayList<>();
    public static List<Integer> linkedList = new LinkedList<>();

    // For Task 3
    public static Map<User, Integer> usersScores = new HashMap<>();
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        /* Task #1. Receiving a random objects collection as an input and
                    returning the same objects collection (without duplicates) as an output. */
        addElementsToList();
        System.out.println("====================================================");
        removeSimilarObjects(carList);
        System.out.println("====================================================");


        /* Task #2. Effectiveness of getting elements by index: ArrayList vs LinkedList. */
        addElementsToArrayList();
        long before = System.currentTimeMillis();
        getElements100000TimesFromArrayList();
        long after = System.currentTimeMillis();
        System.out.println("ArrayList timer: " + (after - before));
        System.out.println("====================================================");
        addElementsToLinkedList();
        before = System.currentTimeMillis();
        getElements100000TimesFromLinkedList();
        after = System.currentTimeMillis();
        System.out.println("LinkedList timer: " + (after - before));
        System.out.println("====================================================");
        /* Сложность получения элемента по индексу в ArrayList O(n), а в LinkedList - O(n2)
           Поэтому поиск элементов по индексу в LinkedList будет выполняться значительно дольше. */


        /* Task #3. HashMap for keeping Users' names and scores */
        addElementsToHashMap();
        System.out.println("====================================================");
        getScores();
    }


    // Task 1. Methods
    public static void addElementsToList() {
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 100);
            carList.add(new Car("Brand" + random, random));
        }
        System.out.println("CarList size = " + carList.size());
        for (Car car : carList) {
            System.out.println(" " + car);
        }
    }

    public static Set<Car> removeSimilarObjects(List<Car> carList) {
        for (Car car : carList) {
            carSet.add(car);
        }
        System.out.println("CarSet size = " + carSet.size());
        int counter = 0;
        for (Car car : carSet) {
            System.out.println(counter + " " + car);
            counter++;
        }
        return carSet;
    }


    // Task 2. Methods

    public static void addElementsToArrayList() {
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add((int) (Math.random() * 1000));
        }
        System.out.println("ArrayList size = " + arrayList.size());
    }


    public static void addElementsToLinkedList() {
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add((int) (Math.random() * 1000));
        }
        System.out.println("LinkedList size = " + linkedList.size());
    }

    public static void getElements100000TimesFromArrayList() {
        for (int i = 0; i < 1000000; i++) {
            int randomNumber = (int) (Math.random() * 1000);
            arrayList.get(randomNumber);
        }
    }

    public static void getElements100000TimesFromLinkedList() {
        for (int i = 0; i < 1000000; i++) {
            int randomNumber = (int) (Math.random() * 1000);
            linkedList.get(randomNumber);
        }
    }

    // Task 3. Methods

    public static void addElementsToHashMap() {
        for (int i = 0; i < 100; i++) {
            int score = (int) (Math.random() * 100);
            usersScores.put(new User("User" + i), score);

        }
        System.out.println("HashMap size = " + usersScores.size());
        System.out.println(usersScores.entrySet());
    }

    public static void getScores() {
        System.out.println("To receive scores, please, enter the user's name:");
        String name = scanner.nextLine();
        scanner.close();
        User user = new User(name);
        System.out.println(name + " scores = " + usersScores.get(user));
    }
}
