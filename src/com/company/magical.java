package com.company;

import java.util.Random;

public class magical extends hero{
    public magical(int health, int damage) {

        super(health, damage);
    }

    @Override
    public void useAbility(hero[] heroes, boss boss) {
        int isAvailable = new Random().nextInt(5);
        if(isAvailable == 1){
            int superDamage = this.health;
            this.damage = this.damage + superDamage;
            System.out.println("Magical used his super damage on: " + superDamage);
        }
    }

}