package com.arrayOneD;

public class Helper {
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
            if (i == arr.length-1)
                System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.linearSearchAlgo(arr, 40));

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearchAlgo(arr,40));


        int arr1[] = {88, 99, 22, 11, 11, 44, 33, 88};
        BubbleSort bubbleSort = new BubbleSort();
        arr1 = bubbleSort.bubbleSortAlgo(arr1);
        Helper.display(arr1);

        System.out.println("*************");
        SelectionSort selectionSort = new SelectionSort();
        arr1 = selectionSort.selectionSortAlgo(arr1);
        Helper.display(arr1);

        System.out.println("*************");
        InsertionSort insertionSort = new InsertionSort();
        arr1 = insertionSort.insertionSortAlgo(arr1);
        Helper.display(arr1);

    }
}
