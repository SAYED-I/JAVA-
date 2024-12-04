import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student me = new Student(21, 3);
        Student you = new Student(22, 4);

        Classroom ab12 = new Classroom(500, me);

        ab12.RepAge(10);
        Student.amountSaved = 100;


    }
}
