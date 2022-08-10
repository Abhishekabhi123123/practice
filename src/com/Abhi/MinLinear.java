package com.Abhi;

public class MinLinear {
    public static void main(String[] args) {
        int[] arr = {12,11,10,2,23};
//        System.out.println(min(arr));
        int ans = min(arr);
        System.out.println(ans);

    }
    static int min(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans){
                ans = arr[i];

            }
        }
        return ans;
    }
}
