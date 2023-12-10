package org.example.softwareTestingFundamentals.complexNumber;

import java.util.Objects;

public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        // return Double.compare(re, complex.re) == 0 && Double.compare(im, complex.im) == 0;
        return Math.abs(re - complex.re) < 0.000001 && Math.abs(im - complex.im) < 0.000001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
