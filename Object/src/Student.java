

public class Student {
    private int age;
    private int yearGroup;
    static int amountSaved;
    private String studentName;

    Student(int age, int yearGroup) {
        this.age = age;
        this.yearGroup = yearGroup;
    }

    public void YearGroup(int yearGroup) {
        this.yearGroup = yearGroup;
    }
    public void Age(int age) {
        this.age = age;
    }
    public int getYearGroup() {
        return yearGroup;
    }
    public int getAge() {
        return age;
    }

}
