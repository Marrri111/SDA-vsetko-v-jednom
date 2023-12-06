package org.example.javaFundamentals.november.dvanasty.innerstatic;

public class Factory {
    String place;

    public Factory(String place) {
        this.place = place;
    }

    public Computer.Procesor createProcesor(int coreCount, int fre){
        return new Computer.Procesor(fre,coreCount);
    }

    public Computer createComputer(){
        return new Computer("PC");
    }

    public void assembyComputer(Computer c, Computer.Procesor p){
        c.setProcesor(p);
    }

    public static void main(String[] args) {
        Factory factory = new Factory("Thaiwan");
        Factory usa = new Factory("USA");
        Computer.Procesor procesor = factory.createProcesor(8, 3000);

        Computer computer = factory.createComputer();

        usa.assembyComputer(computer,procesor);
        computer.increaseFrekq();
    }
}
