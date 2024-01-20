package inheritanceExample;

public class SalariedEmp extends Employee{
    int bonus ;
    int deduction;
    public SalariedEmp(int s, int r, String j, String n, String nat, int p, int a ,int b , int dedu ) {
        super(s, r, j, n, nat, p, a);
        this.bonus = b;
        this.deduction = dedu;
    }
    @Override
    public int getSalary() {

        return salary + bonus - deduction;
    }

}
