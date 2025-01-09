package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());



        Player player = new Player("İlayda", 160, Weapon.SWORD);
        System.out.println("Initial Health: " + player.healthRemaining());

        player.loseHealth(40);
        System.out.println("Health after damage: " + player.healthRemaining());

        player.loseHealth(60);

        player.restoreHealth(70);
        System.out.println("Health after restoration: " + player.healthRemaining());
    }
}


