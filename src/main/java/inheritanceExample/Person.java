package inheritanceExample;

public class Person {

    String name;
    String nationality;
    int phone;
    int age ;

    public Person(String n, String nat, int p, int a) {
        this.name = n;
        this.nationality = nat;
        this.phone = p;
        this.age = a;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
