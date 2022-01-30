package com.company;

public class weapon {
    protected int damage, duration;
    protected String weaponType;

    public weapon(int damage, int duration, String weaponType) {
        this.damage = damage;
        this.duration = duration;
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "--Damage: " + damage +
                " Duration: " + duration +
                " Weapon Type: " + weaponType;
    }
    }
