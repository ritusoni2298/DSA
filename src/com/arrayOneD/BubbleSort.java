package com.arrayOneD;

public class BubbleSort {
    public  int[] bubbleSortAlgo(int[] array){
        for(int counter=0; counter<array.length-1; counter++){
            for(int j=0; j<array.length-1-counter; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

}
