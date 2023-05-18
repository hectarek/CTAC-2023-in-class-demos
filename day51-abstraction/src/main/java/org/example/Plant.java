package org.example;

abstract class Plant {
    String name;
    boolean hasRoots;

    abstract void absorbSun();
    abstract void photosynthesis();
    abstract void grow();

    void absorbWater() {
        System.out.println("Currently soaking in the water");
    }

}
