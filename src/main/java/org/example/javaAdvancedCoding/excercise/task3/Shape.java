package org.example.javaAdvancedCoding.excercise.task3;

public class Shape {
    //Shape class
    //Implement the  Shape  class. It should contain:
    //color information
    //information if color should ll a shape
    //non-arguments constructor which will set: the  color  eld to  unknown  and
    //the  isFilled  eld to  false
    //two-arguments constructor:  color ,  isFilled
    //getter  methods which will be responsible for returning declared elds
    //setter  methods which will be responsible for setting declared elds
    //toString  method which should return the following information:  Shape
    //with color of ? and filled/NotFilled , where ? is a placeholder for the
    //color and the  filled / not filled  info should be returned depending on
    //the  isFilled  eld

    //třída Shape
    //Implementace třídy Shape. Měla by obsahovat:
    //informace o barvě
    //informaci, zda má barva obsahovat tvar být vybarvený (boolen)
    //konstruktor bez argumentů, který nastaví: eld barvy na neznámou a
    //eld isFilled na false
    //konstruktor se dvěma argumenty: color , isFilled
    //metodygetter, které budou zodpovědné za vrácení deklarovaných eldů
    //setter metody, které budou zodpovědné za nastavení deklarovaných eldů
    //toString metoda, která by měla vracet následující informace:  Shape
    //s barvou ? a filled/NotFilled , kde ? je zástupný symbol pro tvar ?
    //barva a informace o vyplnění/nevyplnění by měla být vrácena v závislosti na
    //vyplněno eld


    private String color;
    private boolean fill;

    public Shape() {
        this("unknown", false);
    }

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        return String.format("Shape\n" + "with color of %s and %s", color, fill ? "filled" : "not filled");
    }
}
