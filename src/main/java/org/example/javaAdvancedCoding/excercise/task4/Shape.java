package org.example.javaAdvancedCoding.excercise.task4;

public abstract class Shape {
//    Modify implementation prepared as a scope of task 2. Refactor the following
//    functionality:
//    make the Shape  class abstract
//    change the Shape  class elds access modiers to protected
//    add two abstract methods: getArea  and getPerimeter
//    Each class which is extending the Shape  class directly/indirectly should override
//    abstract methods from base class.
//    Please provide an example usage of above implementation


    protected String color;
    protected boolean fill;

    public Shape() {
        this("unknown", false);
    }

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

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
