package org.example.javaFundamentals.november.dvanasty.body;

public class BodyMain {
    public static void main(String[] args) {
        Body body = new Body(180, "blond");
        body.getHead().paintHair("red");
        Body.Head head =  body.new Head("black");
    }
}
