public class ExpeditionMember {
    private String studentName;
    private String studentID;
    public static int memberCounter = 0;

    ExpeditionMember(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        memberCounter++;
    }

    // getter and setter for studentNane
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // getter and setter for studentID
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String toString() {
        return studentName + " " + studentID;
    }
}
