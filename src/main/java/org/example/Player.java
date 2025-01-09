// Player class
package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // Constructor
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;

        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    // Methods
    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Player player = new Player("John", 120, Weapon.SWORD);
        System.out.println("Initial Health: " + player.healthRemaining());

        player.loseHealth(30);
        System.out.println("Health after damage: " + player.healthRemaining());

        player.loseHealth(80);

        player.restoreHealth(50);
        System.out.println("Health after restoration: " + player.healthRemaining());
    }
}
