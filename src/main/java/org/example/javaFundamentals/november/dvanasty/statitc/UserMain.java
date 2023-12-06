package org.example.javaFundamentals.november.dvanasty.statitc;

public class UserMain {
    public static void main(String[] args) {
        User ferda = new User("ferda", "123");
        User user = new User("nemo", "kjdxekje");
        System.out.println(ferda.getName());
        System.out.println(user.getName());
        System.out.println(User.getCount());
        //volani jine staticke metody

        String vstup = MyScanner.nextLine();
        System.out.println(vstup);

    }
}
