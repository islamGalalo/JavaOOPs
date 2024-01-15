package org.example;

public class Rectangular {
    public  double width ;
    public double length ;
    public Rectangular() {
        double width =2;
        double length =2 ;

    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea (){
        return length * width ;
    }

}
