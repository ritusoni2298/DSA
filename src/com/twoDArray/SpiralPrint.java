package com.twoDArray;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int row,col=0;
        int len=arr.length-1;
        int start=0;
        while(start<len){
            //column increasing
            row=start;
            for(col=start;col<=len;col++){
                System.out.println(arr[row][col]);
            }

            col=len;
            for(row=start+1;row<=len-1;row++){
                System.out.println(arr[row][col]);
            }

            row=col;
            for(col=len;col>=start;col--){
                System.out.println(arr[row][col]);
            }

            col=start;
            for(row=len-1;row>=start+1;row--) {
                System.out.println(arr[row][col]);
            }

            start=start+1;
            len=len-1;
        }
    }
}
