package com.workintech.Composition;

public class Room {
    private int size;
    private int width;
    private boolean isItOnTheFloor;

    public Room(int size, int width, boolean isItOnTheFloor) {
        this.size = size;
        this.width = width;
        this.isItOnTheFloor = isItOnTheFloor;
    }

    public int getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }

    public boolean isItOnTheFloor() {
        return isItOnTheFloor;
    }

    @Override
    public String toString() {
        return "Room{" +
                "size=" + size +
                ", width=" + width +
                ", isItOnTheFloor=" + isItOnTheFloor +
                '}';
    }
}
