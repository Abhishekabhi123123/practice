package com.Abhi;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 1;
        int b = 1;
        int result = 0;
        int count = 2;

        while(count < n){
            result = a + b;
            a = b;
            b = result;
            count++;
        }
        System.out.println(result);
    }
}
