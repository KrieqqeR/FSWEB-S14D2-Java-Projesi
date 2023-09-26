package com.workintech.Composition;

public class Wardrobe {
    private int heigth;
    private int width;
    private double weigth;

    public Wardrobe(int heigth, int width, double weigth) {
        this.heigth = heigth;
        this.width = width;
        this.weigth = weigth;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getWidth() {
        return width;
    }

    public double getWeigth() {
        return weigth;
    }
    public void add(){
        System.out.println("Wardrobed added into Bedroom.");
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "heigth=" + heigth +
                ", width=" + width +
                ", weigth=" + weigth +
                '}';
    }
}

