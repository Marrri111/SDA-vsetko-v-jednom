package org.example.javaFundamentals.november.jedenasty.jednaVecDokopy;

import org.example.javaFundamentals.november.jedenasty.jednaVecDokopy.Room;
import org.example.javaFundamentals.november.jedenasty.jednaVecDokopy.Service;

public class Main {
        public static void main(String[] args) {
            Room r1= new Room(20,"Obyvak");
            Room r2=new Room(10,"Kuchyn");

            Service jana = new Service("Jana");
            jana.cleanRoom(r1);
        }
    }
