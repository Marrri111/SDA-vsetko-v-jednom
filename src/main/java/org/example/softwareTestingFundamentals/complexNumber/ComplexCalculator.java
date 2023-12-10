package org.example.softwareTestingFundamentals.complexNumber;

import org.example.softwareTestingFundamentals.complexNumber.Complex;

public class ComplexCalculator {
    public Complex add(Complex c1, Complex c2) {
        return new Complex(c1.getRe() + c2.getRe(), c1.getIm() + c2.getIm());
    }

    public Complex sub(Complex c1, Complex c2) {
        return new Complex(c1.getRe() - c2.getRe(), c1.getIm() - c2.getIm());
    }
}
