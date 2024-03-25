package org.example.javaAdvancedCoding.excercise.task3;

public class Circle extends Shape {
    //Implement the  Circle  class. It should extend the  Shape  class. Implementation
    //should meet the below criteria:
    //information about the radius value
    //non-arguments constructor which will set: the  color  eld value to  unknown ,
    //the  isFilled  eld value to  false  and the  radius  eld value to  1
    //three-arguments constructor:  color ,  isFilled ,  radius
    //getter  methods which will be responsible for returning the  radius  value
    //setter  methods which will be responsible for setting the  radius  value
    //getArea  method which will be responsible for calculating the surface area
    //getPerimeter  method which will be responsible for calculating the circuit
    //toString  method which should return the following information:  Circle
    //with radius=? which is a subclass off y , where ? is a placeholder for
    //the radius value and the  y  info should be a result of the  toString
    //execution from the base class

    //Implementace třídy Circle. Měla by rozšiřovat třídu Shape. Implementace
    //by měla splňovat níže uvedená kritéria:
    //informace o hodnotě poloměru
    //konstruktor bez argumentů, který nastaví: hodnotu eld barvy na neznámou ,
    //hodnotu eld isFilled na false a hodnotu eld radius na 1
    //konstruktor se třemi argumenty: color , isFilled , radius
    //metodygetter, které budou zodpovědné za vrácení hodnoty radiusu
    //setter metody, které budou zodpovědné za nastavení hodnoty poloměru
    //metodagetArea, která bude zodpovědná za výpočet plochy povrchu
    //metodagetPerimeter, která bude zodpovědná za výpočet obvodu metoda
    //toString, která by měla vracet následující informace:  Kruh
    //s poloměrem=?, což je podtřída mimo y , kde ? je zástupný symbol pro
    //hodnota poloměru a informace o y by měla být výsledkem metody toString
    //vykonání ze základní třídy

    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(String color, boolean fill, double radius) {
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%s which is a subclass off %s", radius, super.toString());
    }
}
