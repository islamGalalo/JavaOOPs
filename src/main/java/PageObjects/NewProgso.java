package PageObjects;

public class NewProgso {
    public static void main(String[] args) {

        Programso pros = new Programso() ;
       pros.setAge(12);
       pros.setName("sass");
       pros.setExperience(8);
       pros.setNationality("egyptian");
       pros.printData();
    }
}
