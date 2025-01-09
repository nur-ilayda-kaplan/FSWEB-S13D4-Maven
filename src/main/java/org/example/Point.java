package org.example;


public class Point {
    //Bu iki değişkene sadece bu sınıf içerisinden erişilebilinmeli.
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Point sınıfı içerisinde bir tane distance isminde metod tanımlayınız.
    // Overloaded distance methods
    //distance() hiçbir değer almazsa (0,0) noktasına göre uzaklık hesaplanmalı.
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    //distance(Point p) şeklinde başka bir Point objesi alırsa verilen noktaya göre uzaklık hesaplanmalı.
    public double distance(Point p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }

    //distance(int a, int b) şeklinde 2 farklı int parametresi alınırsa (a,b) ye göre uzaklık bulunmalı.
    public double distance(int a, int b) {
        return Math.sqrt((a - this.x) * (a - this.x) + (b - this.y) * (b - this.y));
    }

}


