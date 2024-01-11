package org.example;

public class EmployeeTest {
    public static void main(String args[]) {
        Employee empOne = new Employee("Roni");
        Employee empTwo = new Employee("LEO");
       empOne.empAge(20);
       empOne.empSalary(10000);
       empOne.empDesignation(true);
       empOne.printEmp();
        empTwo.empAge(33);
        empTwo.empSalary(30000);
        empTwo.empDesignation(false);
        empTwo.printEmp();
    }

}
