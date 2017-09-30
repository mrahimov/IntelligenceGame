package com.example.muridjonrahimov.test;

/**
 * Created by muridjonrahimov on 9/24/17.
 */


public class FlowerPot {

    private int maxFlowers;
    private int numberOfFlower;

    public FlowerPot(int maxFlowers) {

        this.maxFlowers = maxFlowers;
    }

    public boolean isFull() {

        return maxFlowers == numberOfFlower;
    }

    public void addFlower() {
        if (!isFull()) {
            numberOfFlower += 1;
        }
    }

    public int getMaxFlowers() {
        return maxFlowers;
    }

    public int getNumberOfFlower() {
        return numberOfFlower;
    }

    public void setNumberOfFlower(int numberOfFlower) {
        this.numberOfFlower = numberOfFlower;
    }
}




