package com.arrayOneD;

public class LinearSearch {
    public boolean linearSearchAlgo(int[] array, int data){
        for (int j : array) {
            if (j == data) {
                return true;
            }
        }
        return false;
    }
}
