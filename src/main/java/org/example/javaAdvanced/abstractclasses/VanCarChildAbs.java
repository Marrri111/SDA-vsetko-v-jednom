package org.example.javaAdvanced.abstractclasses;

public class VanCarChildAbs extends MainAbstractCar {

    @Override
    protected String carInfoFromChild() {
        return getCar() + ">>van car<<";
    }

    @Override
    protected Integer carInfoLength() {
        return 14;
    }

    @Override
    protected Integer carInfoWidth() {
        return 2;
    }


}
