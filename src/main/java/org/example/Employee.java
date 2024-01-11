package org.example;

public class Employee {

    String name;
    int age;
    boolean designation;
    int salary;
public Employee (String name){
    this.name = name ;

}
    // Assign the age of the Employee  to the variable age.
    public void empAge(int empAge) {
        age = empAge;
    }
    /* Assign the designation to the variable designation.*/
    public void empDesignation(boolean empDesig) {
        designation = empDesig;
    }
    public void empSalary(int empSalary) {
        salary = empSalary;
    }
    public void printEmp (){
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
    }











}