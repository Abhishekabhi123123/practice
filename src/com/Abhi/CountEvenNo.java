package com.Abhi;

public class CountEvenNo {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(countNo(arr));
    }
    static int countNo(int[] arr){

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            while (arr[i] > 0) {
                c++;
                arr[i] /= 10;
            }
            if (c % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
