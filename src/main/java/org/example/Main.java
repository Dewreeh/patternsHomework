package org.example;

import org.example.adapter.*;
import org.example.factory.Coffee;
import org.example.factory.CoffeeFactory;
import org.example.factory.CoffeeType;
import org.example.proxy.ConnectToDb;
import org.example.proxy.ProxyConnectToDb;
import org.example.singleton.SingletonLogger;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        // 1) Singleton

        System.out.println("--Singleton--");

        Scanner sc = new Scanner(System.in);
        SingletonLogger logger = SingletonLogger.getInstance();
        SingletonLogger logger2 = SingletonLogger.getInstance();

        System.out.println("Проверка объектов на равенство:" + logger.equals(logger2));

        logger.classLogg(sc, "info");



        // 2) Factory

        System.out.println("\n--Factory--");

        CoffeeFactory factory = new CoffeeFactory();
        Coffee coffee = factory.getCoffee(CoffeeType.AMERICANO);
        Coffee coffee2 = factory.getCoffee(CoffeeType.ESPRESSO);



        // 3) Adapter

        System.out.println("\n--Adapter--");

        Computer computer = new Computer();

        MemoryCard memoryCard = new MemoryCard();
        Adapter adapter = new Adapter(memoryCard);
        computer.connect(adapter);


        // 4) Proxy

        System.out.println("\n--Proxy--");

        ProxyConnectToDb proxyConnectToDb = new ProxyConnectToDb();
        proxyConnectToDb.connect("test");

    }
}