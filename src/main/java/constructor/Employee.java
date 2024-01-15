package constructor;

public class Employee {
    int emp_ID ;
    String name ;
    String depart ;
    double salary ;
    double bonus ;
    boolean resident ;
// overloading same constructor or method name but different parameter
    public Employee ( int id,  String n) {
     emp_ID = id ;
     name = n ;

    }
    public Employee (int id , String n , boolean r){
      resident = r ;
      this.name = n ;
      this.emp_ID = id ;
    }
    public Employee (int id , String  n , String d , double s ,boolean r){
        this.name = n ;
        this.emp_ID = id ;
        this.resident = r ;
        depart = d ;
        salary =s ;
    }
     public void print_empdata (){


         System.out.println(salary);
         System.out.println(bonus);
         System.out.println(name);
         System.out.println(emp_ID);
         System.out.println(depart);
         System.out.println(resident);
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
