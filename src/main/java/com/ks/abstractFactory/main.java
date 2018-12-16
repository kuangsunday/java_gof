package com.ks.abstractFactory;

public class main {

    public static void main(String[] args) {
        FruitFactory ff1 = new NorthFruitFactory();
        ff1.getApple().get();
        ff1.getBanana().get();

        FruitFactory ff2 = new SouthFruitFactory();
        ff2.getApple().get();
        ff2.getBanana().get();
    }
}
