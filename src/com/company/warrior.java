package com.company;

import java.util.Random;

public class warrior extends hero{
    public warrior(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void useAbility(hero[] heroes, boss boss) {
        boolean isAvailable = this.health < 400 ;
        if(isAvailable == true){
            int randomDamage = new Random().nextInt(501);
            this.damage = this.damage + randomDamage;
            System.out.println("Warrior boosted his damage on: " + randomDamage);
        }
    }

}
