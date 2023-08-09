package src.Practice.Day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Tom", "O-36");
        Teacher teacher = new Teacher("Bob", "chemistry");

        System.out.println(student.getNameGroup());
        System.out.println(teacher.getLesson());

        student.printInfo();
        teacher.printInfo();
    }
}
