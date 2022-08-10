package com.Abhi;

public class WealthQuesLinear {
    public static void main(String[] args) {
        int[][] arr ={
                {11,22,12},
                {22,13,4}
        };
        System.out.print("the max wealth is: ");
        System.out.println(wealthLin(arr));

    }
    static int wealthLin(int[][] arr){

        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++){
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++){
                sum+=arr[row][col];
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
