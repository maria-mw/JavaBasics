package Java_Basics.Lesson_2.ITMO;

public class Box {
    double width;
    double height;
    double length;

    public Box() {
        this.width = 0;
        this.height = 0;
        this.length = 0;
    }

    public Box(Double size) { //cube
        this.width = size;
        this.height = size;
        this.length = size;
    }

    public Box(Double width, Double height, Double length) { //cuboid
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }

    public Double volume () {
        return this.width * this.height * this.length;
    }
}

