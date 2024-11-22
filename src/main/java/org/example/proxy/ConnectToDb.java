package org.example.proxy;

public class ConnectToDb implements IConnectToDb{
    public static final String dbName = "test";
    public void connect(String fullUrl){
        System.out.println("Подключено " + fullUrl);
    }
}
