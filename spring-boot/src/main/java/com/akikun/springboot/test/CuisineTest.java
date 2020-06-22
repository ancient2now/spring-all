package com.akikun.springboot.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CuisineTest {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int lineNums = scan.nextInt();
        while (lineNums-- > 0) {
            String cuisineStr = "";
            try {
                cuisineStr = scan.next();
                Cuisine cuisine = Cuisine.valueOf(cuisineStr);
                System.out.println("Serving " + scan.next() + "(" + cuisine.name() + ")");
            } catch (Exception e) {
                System.out.println("Unservelable cuisine " + cuisineStr + " for dish " + scan.next());
            }
        }
    }
}

enum Cuisine {

    Chinese,

    Italian,

    Japanese,

    Mexican;

    private Set<String> dishs = new HashSet<>();

    void serveFood(String dish) {
        dishs.add(dish);
    }

}



