package com.ks.abstractFactory;

public class NorthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
