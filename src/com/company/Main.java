package com.company;

public class Main {

    public static void main(String[] args) {

        lingkaran bunder = new lingkaran();
        bunder.hitungLuas();
    }
}
class lingkaran{
    public int radius = 20;
    public double pi= 3.14;

    public void hitungLuas(){
        System.out.print( 0.5*pi*radius*radius);
    }
}

