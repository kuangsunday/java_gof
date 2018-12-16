package com.ks.factory;

public class main {

    public static void main(String[] args) {
        FruitFactory ff1 = new AppleFactory();
        ff1.getFruit().get();

        FruitFactory ff2 = new BananaFactory();
        ff2.getFruit().get();

    }
}
