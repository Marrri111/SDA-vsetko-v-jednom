package org.example.javaAdvancedCoding.excercise.task4;

public class Rectangle extends Shape {
    //Implmenent the  Rectangle  class. It should extend the  Shape  class.
    //Implementation should meet the below criteria:
    //information about the width and length value as a  double  type
    //non-arguments constructor which will set: the  color  eld value to  unknown ,
    //the  isFilled  eld value to  false  and the  width  and  length  eld value to
    //1
    //four-arguments constructor:  color ,  isFilled ,  width  i  length
    //getter  methods which will be responsible for returning the  width  and
    //length  value
    //setter  methods which will be responsible for setting the  width  and
    //length  value
    //getArea  method which will be responsible for calculating the surface area
    //getPerimeter  method which will be responsible for calculating the circuit
    //toString  method which should return the following information:
    //Rectangle with width=? and length=? which is a subclass off y ,
    //where ? is a placeholder for the width and length value accordingly and the
    //y  info should be a result of the  toString  execution from the base class

    //Implementace třídy Rectangle. Měla by rozšiřovat třídu Shape.
    //Implementace by měla splňovat níže uvedená kritéria:
    //informace o hodnotě šířky a délky jako typu double
    //konstruktor bez argumentů, který nastaví: hodnotu eld barvy na neznámou ,
    //hodnotu eld isFilled na false a hodnoty eld width a length na
    //1
    //konstruktor se čtyřmi argumenty: color , isFilled , width i length
    //metodygetter, které budou zodpovědné za vrácení šířky a
    //délka hodnotu
    //setter metody, které budou zodpovědné za nastavení šířky a
    //délka hodnotu
    //metodagetArea, která bude zodpovědná za výpočet plochy povrchu
    //metodagetPerimeter, která bude zodpovědná za výpočet obvodu metoda
    //toString, která by měla vracet následující informace:
    //Obdélník s width=? a length=?, který je podtřídou y ,
    //kde ? je zástupný znak pro odpovídající hodnoty šířky a délky a ?
    //y informace by měla být výsledkem provedení toString ze základní třídy

    private double lenght;
    private double width;

    public Rectangle() {
        lenght = 1;
        width = 1;
    }

    public Rectangle(String color, boolean fill, double lenght, double width) {
        super(color, fill);
        this.lenght = lenght;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (lenght + width);
    }

    public double getArea() {
        return lenght * width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width=%s and length=%s which is a subclass off %s", width, lenght, super.toString());
    }
}
