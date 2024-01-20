package inheritanceExample;

public class MainProgram {
    public static void main(String[] args) {
        Student s1 = new Student("1" ,"Engineering" , 2 , "islam","Egy" ,131,12);
     //   Employee e1 = new Employee(1 , 123 , "client");
        System.out.println(s1.getName());
        Employee s2 = new Employee(500 ,1 ,"eng" , "leo" ,"arg",3312,22);
        System.out.println(s2.getSalary());
        Employee s3 = new SalariedEmp(1000 ,1 ,"eng" , "leo" ,"arg",865475,31,600 , 100);
        System.out.println(s3.getSalary());

    }
}
