package com.arrayOneD;

public class BinarySearch {
    public boolean binarySearchAlgo(int[] array, int data){
        int high = array.length-1;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(array[mid] == data){
                return true;
            }else if(array[mid]<data){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}
