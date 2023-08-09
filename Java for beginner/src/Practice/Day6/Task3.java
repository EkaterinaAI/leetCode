package src.Practice.Day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Петров А.А.", "химия");
        Student student = new Student("Васильев Е.А.");
        teacher.rating(student);
    }
}
