package org.example.javaAdvancedCoding.lambdas;

public class DBLogger implements Logger {
    @Override
    public void log(String msg) {
        //imagine that this op record msg to DB
        System.out.println("loging to db:" + msg);
    }
}
