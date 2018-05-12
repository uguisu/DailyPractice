package com.github.uguisu.www.common.java8.lambdasExercises.example002;

public class Artist {

    private boolean solo;
    private int id;

    public Artist(int id, boolean solo) {
        this.id = id;
        this.solo = solo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public boolean isSolo() {
        return this.solo;
    }
    public void setSolo(boolean solo) {
        this.solo = solo;
    }

    @Override
    public String toString() {
        return String.valueOf(this.id) + " : " + String.valueOf(this.solo);
    }
}
