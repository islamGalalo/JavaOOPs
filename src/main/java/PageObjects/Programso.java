package PageObjects;

public class Programso {
    int age ;
    int experience ;
    String name ;
    String nationality ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
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
    public void printData () {
        System.out.println(name);
        System.out.println(nationality);
        System.out.println(age);
        System.out.println(experience);
    }
}
