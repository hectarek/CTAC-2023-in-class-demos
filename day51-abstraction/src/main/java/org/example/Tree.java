package org.example;

public class Tree implements Vegetation {

    String name;
    boolean hasRoots;
    boolean hasBranches;
    boolean hasLeaves;

    public Tree(String name, boolean hasBranches) {
        this.name = name;
        this.hasRoots = true;
        this.hasBranches = hasBranches;
        this.hasLeaves = true;
    }

    void absorbSun () {
        System.out.println("Currently absorbing rays");
    }

    @Override
    public void grow(int grewByHowMuch) {

    }

    @Override
    public void absorbTheSun() {

    }

    @Override
    public void absorbTheWater() {

    }

    @Override
    public void photosynthesis2() {

    }


}
