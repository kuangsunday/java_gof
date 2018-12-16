package com.ks.simpleFactory;

public class SF {

    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit banana = new Banana();
        apple.get();
        banana.get();
        System.out.println("---------------------------");
        Fruit apple1 = FruitFactory.getApple();
        Fruit banana1 = FruitFactory.getBanana();
        apple1.get();
        banana1.get();
        System.out.println("---------------------------");
        Fruit apple2 = FruitFactory.getFruit(Apple.class);
        Fruit banana2 = FruitFactory.getFruit(Banana.class);
        apple2.get();
        banana2.get();
        System.out.println("---------------------------");
        Fruit apple3 = FruitFactory.getFruit0(Apple.class);
        Fruit banana3 = FruitFactory.getFruit0(Banana.class);
        apple3.get();
        banana3.get();
    }
}
