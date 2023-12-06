package org.example.javaFundamentals.november.dvanasty.innerstatic;

public class Computer {
    String type;//laptop | PC
    Procesor procesor;

    public Computer(String type) {
        this.type = type;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public void increaseFrekq(){
        procesor.frequency += 10;
    }

    public static class Procesor{
        private int frequency;
        private int coreCount;

        public Procesor(int frequency, int coreCount) {
            this.frequency = frequency;
            this.coreCount = coreCount;
        }

    }
}
