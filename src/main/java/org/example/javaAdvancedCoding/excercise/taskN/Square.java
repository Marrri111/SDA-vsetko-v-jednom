package org.example.javaAdvancedCoding.excercise.taskN;

public class Square extends Rectangle {
    //Implement the Square  class which will extend the Rectangle  class. It should
    //not add any new eld or feature, but it should force square behaviour on the base
    //class methods.
    //Please provide an example usage of above implementation.

    //Implementujte třídu Square, která rozšíří třídu Rectangle. Měla by
    //nebude přidávat žádné nové starší třídy nebo funkce, ale měla by vynutit chování čtverce na základně třídy
    //třídy.
    //Uveďte prosím příklad použití výše uvedené implementace.


    @Override
    public void setWidth(double width) {
        super.setLenght(width);
        super.setWidth(width);
    }

    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght);
        super.setWidth(lenght);
    }

    public Square() {
        setWidth(1);
    }

    public Square(String color, boolean fill, double width) {
        super(color, fill, width, width);
    }

    @Override
    public String toString() {
        return String.format("Square with length=%s which is a subclass off %s", getLenght(), super.toString());
    }
}
