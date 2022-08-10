package com.Abhi;

public class BibarySearch {
    public static void main(String[] args) {
        int[] arr = {12,22,23,25,44,47,50};
//        int target = 44;
        int ans = binarySearch(arr,22);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if (target < arr[mid] ){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
