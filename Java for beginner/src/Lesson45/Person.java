package src.Lesson45;

//import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
//    @Serial
    private static final long serialVersionUID = 649896582699263792L;
    private int id;
    private String name;

    public Person (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
