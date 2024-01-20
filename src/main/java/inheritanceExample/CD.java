package inheritanceExample;

public class CD implements  Retail{
    double price;
    String title ;
    String artist ;

    public CD(double price, String title, String artist) {
        this.price = price;
        this.title = title;
        this.artist = artist;
    }
    public CD(){

    }

    @Override
    public double getPrice() {
        return price;
    }
}
