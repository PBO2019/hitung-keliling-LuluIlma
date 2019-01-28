package com.company;

public class Setget {
    public static void main(String[] args){
        BujurSangkar persegi = new BujurSangkar();
        Lingkaran bunder = new Lingkaran();

        persegi.setSisi(5);
        persegi.hitungKeliling();
        System.out.print(" Jadi Keliling Perseginya Adalah "+ persegi.getKeliling());
System.out.println();
        bunder.setRadius(14);
        bunder.hitungLingakaran();
        System.out.println(" Jadi Keliling Lingkaran Adalah "+ bunder.getRadius());
        System.out.println(" ==== TERIMAKASIH=====");
    }
}
