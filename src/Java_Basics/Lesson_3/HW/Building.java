package Java_Basics.Lesson_3.HW;

import java.time.LocalDate;

public class Building {
    private Integer numberOfFloors;
    private Integer constructionYear;
    private BuildingTitle title;

    public Building(Integer numberOfFloors, Integer constructionYear, BuildingTitle title) {
        this.numberOfFloors = numberOfFloors;
        this.constructionYear = constructionYear;
        this.title = title;
    }

    public Building() {
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Integer getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }

    public BuildingTitle getTitle() {
        return title;
    }

    public void setTitle(BuildingTitle title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "floorsNumber = " + numberOfFloors +
                ", constructionYear = " + constructionYear +
                ", title = " + title;
    }

    public Integer yearsFromConstruction(){
   //     Integer currentYear = Calendar.getInstance().get(Calendar.YEAR);

        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        return currentYear - constructionYear;
    }
}
