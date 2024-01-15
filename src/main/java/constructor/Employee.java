package constructor;

public class Employee {
    int emp_ID ;
    String name ;
    String depart ;
    double salary ;
    double bonus ;
    boolean resident ;
    public Employee (){

    }
    public Employee (int emp_ID , String name) {

    }
    public Employee (int emp_ID , String name , boolean resident){

    }
    public Employee (int emp_ID , String name , String depart, double salary,double bonus , boolean resident ){

    }

    public int getEmp_ID() {
        return emp_ID;
    }

    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean isResident() {
        return resident;
    }

    public void setResident(boolean resident) {
        this.resident = resident;
    }

}
