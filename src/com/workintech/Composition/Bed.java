package com.workintech.Composition;

public class Bed {
    private String style;
    private int pillow;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillow, int height, int sheets, int quilt) {
        this.style = style;
        this.pillow = pillow;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("The bed is being made.");
    }
    public int getPillows(){
        return pillow;
    }
    public int getHeight(){
        return height;
    }
    public int getSheets(){
        return sheets;
    }
    public int getQuilt(){
        return quilt;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "style='" + style + '\'' +
                ", pillow=" + pillow +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilt=" + quilt +
                '}';
    }
}
