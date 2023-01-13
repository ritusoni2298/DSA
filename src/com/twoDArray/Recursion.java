package com.twoDArray;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Recursion {
    public static void PDISkip(int n){
        if(n<0)
            return;
        System.out.println(n);
        PDISkip(n-2);
        if(n+1<=5)
            System.out.println(n+1);
    }

    public static void PDISkip2(int n){
        if(n==0)
            return;
        if(n%2==1)
            System.out.println(n);
        PDISkip2(n-1);
        if(n%2==0)
            System.out.println(n);
    }

    public static int factorial(int n){
        if(n==1)
            return n;
       return factorial(n-1) * n;
    }

    public static int fibonacci(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int power(int n, int x){
        if(x==1)
            return n;
        return power(n,x-1) * n;
    }

    public static boolean isSorted(int[] arr, int si){
        if(si-1 == 0){
            System.out.println("index si="+si+" value  "+ arr[si]+"index si+1 =="+ arr[si-1]+"value == "+(si-1));
            return arr[si] > arr[si-1];
        }
        System.out.println("index si="+si+" value  "+ arr[si]+"index si+1 =="+ arr[si-1]+"value == "+(si-1));
        boolean result = arr[si] > arr[si-1];
        return result && isSorted(arr, si-1) ;
    }

    public static boolean isSortedSecondWay(int[] arr, int si){ //better not going further if found false
        if(si == 0){
            return true;
        }
        if(arr[si] < arr[si-1])
            return false;
        else
            return isSortedSecondWay(arr, si-1);
    }

    public static int lastIndex(int arr[], int si, int data){
        if(si==0)
            return -1;
        if (arr[si-1] == data)
            return si-1;
        else
            return lastIndex(arr, si-1, data);
    }

    public static int firstIndex(int[] arr, int si, int data){
        if(si == 0) {
            return -1;
        }
        if(arr[arr.length-si] == data)
            return arr.length-si;
        return firstIndex(arr, si-1, data);
    }

    public static int[] findAllIndices(int[] arr, int si, int data, int count){
        if(si == arr.length)
            return new int[count];
        int[] res = null;
        if(arr[si] == data) {
            res = findAllIndices(arr, si + 1, data, count + 1);
            res[count] = si;
        }
        else
            res = findAllIndices(arr, si+1, data, count);
        return res;
    }

    public static void bubbleSort(int arr[], int si, int li){
        if (li==0)
            return;
        if(si==li){
            bubbleSort(arr, 0, li-1);
            return;
        }
        if(arr[si]>arr[si+1]){
            int temp = arr[si];
            arr[si] = arr[si+1];
            arr[si+1] = temp;
        }
        bubbleSort(arr, si+1, li);
    }
    //formula : 2^n
    public static ArrayList<String> getSubSequences(String str){
        if(str.equals("")){
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        char c = str.charAt(0);
        String str1 = str.substring(1);
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = getSubSequences(str1);
        for(int i=0; i< recResult.size();i++){
            myResult.add(recResult.get(i));
            myResult.add(c+recResult.get(i));
            //myResult.add((int)c+recResult.get(i)); to get ss with ascii
        }
        return myResult;
    }

    //formula = n!
    public static ArrayList<String> getPermutations(String str){
        if(str.equals("")){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        char c = str.charAt(0);
        String str1 = str.substring(1);

        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rr = getPermutations(str1);
        System.out.println(rr);
        System.out.println(mr);
        for(String rrs : rr){
            for(int j=0; j<=rrs.length();j++){
                String value = rrs.substring(0,j)+c+rrs.substring(j);
                mr.add(value);
                System.out.println(mr);
            }
        }
        return mr;
    }

    public static ArrayList<String> getBoardPath(int curr, int end){
        if(curr == end){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if(curr > end){
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> mr = new ArrayList<>();
        for(int dice=1;dice<=6;dice++){
            ArrayList<String> rr = getBoardPath(curr+dice, end);
            for(String rrs : rr){
                mr.add(dice+rrs);
            }
        }
        return mr;
    }

    public static ArrayList<String> getMazePath(int x1, int y1, int x2, int y2 ){
        if(x1 == x2 && y1==y2){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if(x1>x2 || y1>y2){
            ArrayList<String> br = new ArrayList<>();
            return br;
        }


        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rrH = getMazePath(x1, y1+1, x2, y2);
        for(String rrs:rrH){
            mr.add("H"+rrs);
        }
        System.out.println(mr);
        ArrayList<String> rrV = getMazePath(x1+1, y1, x2, y2);
        for(String rrs: rrV){
            mr.add("V"+rrs);
        }
        ArrayList<String> rrD = getMazePath(x1+1, y1+1, x2, y2);
        for(String rrs:rrD){
            mr.add("D"+rrs);
        }
        System.out.println(mr);
        return mr;

    }
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/ritusoni2298/DSA.git
//    git push -u origin main






    public static void main(String[] args) {
        //PDISkip(5);
//        System.out.println(factorial(4));
//        System.out.println(fibonacci(7));
//        System.out.println(power(2,5)); // 32
        int[] arr = {12,78,120,380,490,560,20,34};
//        System.out.println(isSorted(arr, arr.length-1));
//        System.out.println(isSortedSecondWay(arr, arr.length-1));
        int[] arr1 = {55, 66, 22,33, 11, 10, 99};
//        System.out.println(lastIndex(arr1,arr1.length,22));
//        System.out.println(firstIndex(arr1,arr1.length,22));//7
//        for(int i: findAllIndices(arr1, 0, 22, 0)){
//            System.out.println(i);
//        }
//        System.out.println(getBoardPath(0,10));
//        System.out.println(getSubSequences("abc"));
//        System.out.println(getPermutations("abc"));
        System.out.println(getMazePath(0,0,2,2));
//        bubbleSort(arr1, 0, arr1.length-1 );
//        for(int i: arr1){
//            System.out.println(i);
//        }

    }
}
