package org.example.javaFundamentals.november.jedenasty.jednaVecDokopy;

public class Service {
    private String name;
    private VaccumCleaner vc;

    public Service(String name) {
        this.name = name;
        vc=new VaccumCleaner(500);
    }
    public void cleanRoom(Room room){
        System.out.println(name+" uklidila pokoj "+room.getName()+" za "+1000/vc.getPow());
    }
}
