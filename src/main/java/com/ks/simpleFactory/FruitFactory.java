package com.ks.simpleFactory;

public class FruitFactory {

    public static Fruit getApple() {
        return new Apple();
    }

    public static Fruit getBanana() {
        return new Banana();
    }

    public static Fruit getFruit(Class<? extends Fruit> clazz) {
        if (Apple.class.equals(clazz)) {
            return new Apple();
        } else if (Banana.class.equals(clazz)) {
            return new Banana();
        } else {
            return null;
        }
    }

    public static Fruit getFruit0(Class<? extends Fruit> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
