package Java_Basics.Lesson_6.ITMO.Main;

public abstract class Transport implements Movable {
    private Integer weight;
    private Integer seatPlace;
    private Boolean isFlying;

    public Transport(Integer weight, Integer seatPlace, Boolean isFlying) {
        this.weight = weight;
        this.seatPlace = seatPlace;
        this.isFlying = isFlying;
    }

    abstract void abstractMethod();

    @Override
    public String transportName() {
        return null;
    }

    public void info(){
        //logic
    }
}
