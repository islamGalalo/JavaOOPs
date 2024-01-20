package inheritanceExample;

public class Student extends Person{
    String studentLevel ;
    String specialization ;
    double GPA ;

    public Student(String studentLevel, String specialization, double GPA ,String n, String nat, int p, int a) {
        super(n,nat,p,a);
        this.studentLevel = studentLevel;
        this.specialization = specialization;
        this.GPA = GPA;

    }

    public String getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(String studentLevel) {
        this.studentLevel = studentLevel;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
}
