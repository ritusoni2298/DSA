package com.arrayOneD;

public class SelectionSort {

    public int[] selectionSortAlgo(int[] array){

        for(int counter = 0; counter<array.length-1; counter++){
            int min = counter;
            for(int j = counter+1; j< array.length-1; j++){
                if(array[min]>array[j])
                    min = j;
            }
            int temp = array[counter];
            array[counter] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
