package Java_Basics.Lesson_3.ITMO;

public class Sun {
    private static Sun sun;
    private String color;
    private int size;

    private Sun(){
    }

    public static Sun getSun(){
        if (sun == null) {
            sun = new Sun();
        }
        return sun;
    }

    public static void setSun(Sun sun) {
        Sun.sun = sun;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
