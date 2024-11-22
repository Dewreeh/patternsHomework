package org.example.adapter;

public class Adapter implements IUsb{
    MemoryCard memoryCard;
    public Adapter(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
    }
    @Override
    public void set() {
        memoryCard.set();
    }
}
