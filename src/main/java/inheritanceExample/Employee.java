package inheritanceExample;

public class Employee extends Person {
    int salary ;
    int rank;
    String job ;
    public Employee (int s , int r , String j, String n, String nat, int p, int a){
        super(n, nat, p, a);
        this.salary = s ;
        this.rank = r ;
        this.job = j ;


    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
