package src.Practice.Day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void rating (Student student) {
        Random random = new Random();
        int rating = random.nextInt(4) + 2;

        String textRating;
        switch (rating) {
            case 2:
                textRating = "неудовлетворительно";
                break;
            case 3:
                textRating = "удовлетворительно";
                break;
            case 4:
                textRating = "хорошо";
                break;
            case 5:
                textRating = "отлично";
                break;
            default:
                textRating = "не верное число";
                break;
        }

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName()
                + " по предмету " + this.lesson + " на " + textRating);
    }
}
