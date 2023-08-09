package src.Practice.Day9;

public class Teacher extends Human{
    private String lesson;

    public Teacher(String name, String lesson) {
        super(name);
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
