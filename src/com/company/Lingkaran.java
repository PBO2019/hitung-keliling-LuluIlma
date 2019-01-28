package com.company;

public class Lingkaran {

    private int radius;
    private double hitungLuas;

    public void hitungLingakaran(){

        this.hitungLuas = 0.5 * 3.14* radius * radius;
    }

    public void setRadius(int radius) {
       this.radius=radius;

    }

    public double getRadius(){
        return hitungLuas;
    }
}

