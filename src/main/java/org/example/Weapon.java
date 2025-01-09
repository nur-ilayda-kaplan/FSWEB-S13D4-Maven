
package org.example;

public enum Weapon {
    SWORD(50, 1.5),
    BOW(30, 2.0),
    AXE(60, 1.2);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
// Aynı zamana bu değişkenler için getter metodları da yazılmalı.
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}