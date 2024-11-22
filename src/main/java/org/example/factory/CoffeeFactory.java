package org.example.factory;

import static org.example.factory.CoffeeType.ESPRESSO;

public class CoffeeFactory {
    Coffee coffee;
    public Coffee getCoffee(CoffeeType coffeeType){
        switch (coffeeType){
            case ESPRESSO: coffee = new Espresso();
            break;
            case AMERICANO: coffee = new Americano();
            break;
            default: throw new IllegalArgumentException("Неверный тип кофе");
        }
        return coffee;
    }
}
