package Java_Basics.Lesson_6.ITMO.Main;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Field[] declaredFields = car.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

//        Object object = new Object();
//        Parent parent = new Parent();
//        Parent parent1 = new Child();
//        Parent parent2 = new AnotherChild();

//        parent.print();
//        parent1.print();
//        parent2.print();

        Movable scania = new Bus();
        Movable volvo = new Car();

        printTransportInfo(scania);
        printTransportInfo(volvo);
    }
        public static void printTransportInfo(Movable transport){
            transport.printTransportInfo();
        }
}
