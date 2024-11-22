package org.example.adapter;

public class MemoryCard implements ICard{

    @Override
    public void set() {
        System.out.println("Карта памяти подключена!");
    }
}
