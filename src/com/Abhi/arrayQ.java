package com.Abhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayQ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 11;
//        arr[1] = 12;
//        arr[2] = 13;
//        arr[3] = 14;
//        arr[4] = 15;
////        for (int i = 0; i < arr.length; i++) {
////            arr[i] = scan.nextInt();
////        }
//
//            arr[i] = scan.nextInt();
//        for (int i = 4; i >= 0; i--) {
//            System.out.println(arr[i]);

//        }
////
//
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = scan.next();
//
//        }
//        System.out.println(Arrays.toString(str));
//
//        str[2] = "Abishek";
//        System.out.println(Arrays.toString(str));

//
//        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
//
//        // INITIALIZE
//        for (int i = 0; i < 3; i++) {
//            a.add(new ArrayList<>());
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                a.get(i).add(scan.nextInt());
//            }
//        }
//        System.out.println(a);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}