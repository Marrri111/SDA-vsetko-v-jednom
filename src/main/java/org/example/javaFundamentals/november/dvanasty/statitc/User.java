package org.example.javaFundamentals.november.dvanasty.statitc;

public class User {
    private String name;
    private String password;

    private static int count=0;

    public static int  getCount(){
      //  System.out.println(name);
        //nemuzu volat instancni fieldy, metody
        return count;
    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

}
