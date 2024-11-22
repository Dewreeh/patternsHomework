package org.example.singleton;

import java.time.LocalDate;

public class SingletonLogger {
    private static SingletonLogger singleton;

    private SingletonLogger(){}

    public static SingletonLogger getInstance(){
        if(singleton == null){
            singleton = new SingletonLogger();
        }
        return singleton;
    }

    public void classLogg(Object obj, String info){
        System.out.println("Log info: " + LocalDate.now() + " - " + obj.getClass() + " " + info);
    }
}
