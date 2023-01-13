package com.arrayOneD;

public class InsertionSort {
    public int[] insertionSortAlgo(int[] array){
       for(int counter = 1;counter<array.length; counter++){
           int val = array[counter];
           for(int j = counter-1; j>=0; j--){
               if(array[j+1] > val){
                   array[j+1] = array[j];
               }
           }
       }
       return array;
    }
}
