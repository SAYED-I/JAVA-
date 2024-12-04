public class Singer {
    String name;
    int age;
    Boolean professional;

    Singer(String name, int age) {
        this.name = name;
        this.age = age;
        professional = true;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Boolean getProfessional() {
        return professional;
    }

    //setter
    public void Age(int age) {
        if (age >= this.age) {
            this.age = age;
        }
    }
    public void reverseProfessional() {
        professional = !professional;
    }
    public Boolean isAdult(){
        return age >= 18;
    }
}
