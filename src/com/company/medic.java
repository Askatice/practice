package com.company;

import java.util.Random;

public class medic extends hero {
    public medic(int health, int damage) {

        super(health, damage);
    }

    @Override
    public void useAbility(hero[] heroes, boss boss) {
//        boolean isAvailable = this.health > 0;
//        if (isAvailable) {
//            int randomHealth = new Random().nextInt(400);
//            int a = new Random().nextInt(heroes.length);
//            if(medic.this.health >= 100 && a <= 800  ){
//                System.out.println("Medic health : " + getClass().getSimpleName() + " : " + randomHealth);
//            }
//
//        }
    }
}