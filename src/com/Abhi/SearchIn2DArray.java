package com.Abhi;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {22,21,12},
                {77,14},
                {14,55,13,89}
        };
        int target = 89;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString((ans)));
    }

    static int[] search(int[][] arr,int x){;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == x){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
