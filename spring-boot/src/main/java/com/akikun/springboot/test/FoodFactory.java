package com.akikun.springboot.test;

import java.util.Scanner;

public class FoodFactory {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int lineNums = scan.nextInt();
        while (lineNums-- > 0) {
            String cuisineKey = scan.next();
            String dish = scan.next();
            Cuisine cuisine = FoodFactory.getFactory().serveFood(cuisineKey, dish);

            if (cuisine != null) {
                String print = String.format("Serving %s (%s)", cuisine.getDish(), cuisine.name());
                System.err.println(print);
            }
        }
    }

    private static FoodFactory instance = null;

    public static FoodFactory getFactory() {
        if (instance == null) {
            synchronized (FoodFactory.class) {
                if (instance == null) {
                    instance = new FoodFactory();
                }
            }
        }
        return instance;
    }

    Cuisine serveFood(String cuisineKey, String dish) {
        Cuisine cuisine = null;
        try {
            cuisine = Cuisine.valueOf(cuisineKey);
            cuisine.serveFood(dish);
        } catch (Exception e) {
            String print = String.format("Unservelable cuisine %s for dish %s ", cuisineKey, dish);
            System.err.println(print);
        }
        return cuisine;
    }

    enum Cuisine {

        Chinese,

        Italian,

        Japanese,

        Mexican;

        private final String[] dish = new String[]{""};

        void serveFood(String dish) {
            this.dish[0] = dish;
        }

        String getDish() {
            return dish[0];
        }
    }
}





