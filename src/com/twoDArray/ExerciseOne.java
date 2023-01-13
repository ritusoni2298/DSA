package com.twoDArray;

public class ExerciseOne {
    //Print the array in a wave form
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{5,6,7},{8,9,10},{11,12,13}};
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j] +" ");
                }
                System.out.println();
            }else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j] +" ");
                }
                System.out.println();
            }
        }

    }

}
