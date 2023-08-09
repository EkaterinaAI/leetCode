package src.Practice.Day5;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

    public void textInfo() {
        System.out.println("Это мотоцикл");
    }

    public int substractYear(int year) {
        return Math.abs(year - this.year);
    }
}
