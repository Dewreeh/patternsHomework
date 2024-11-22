package org.example.adapter;

public class UsbCabel implements IUsb{

    @Override
    public void set() {
        System.out.println("USB кабель вставлен");
    }
}
