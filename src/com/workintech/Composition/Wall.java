package com.workintech.Composition;

public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }
    public String getDirection(){
          return this.direction;
    }
    public void create(){
        System.out.println("Wall objesi " + this.getDirection() + " yönüne göre oluşturuldu.");
    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
