package org.example.proxy;

import java.lang.reflect.Proxy;

public class ProxyConnectToDb implements IConnectToDb{
    private final ConnectToDb connectToDb;
    public ProxyConnectToDb(){
        this.connectToDb = new ConnectToDb();
    }

    public void connect(String dbName){
        if((ConnectToDb.dbName).equals(dbName)){   //проверяем, что переданное название соответствует хранящемуся в классе
            String fullUrl = "localhost:port/" + dbName;
            connectToDb.connect(fullUrl);
        } else{
            throw new IllegalArgumentException("Неверное название базы данных");
        }
    }
}
