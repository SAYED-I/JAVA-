import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private int size;
    private Student rep;
    private ArrayList<Student> students;

    Classroom(int size, Student rep) {
        this.size = size;
        this.rep = rep;
    }
    public void RepAge(int age){
        rep.Age(age);
    }
    public int getRepAge() {
        return rep.getAge();
    }



}
