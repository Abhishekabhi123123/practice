package com.Abhi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a no :");
        int n = scan.nextInt();
//
//        int i = 1;
//        int sum = 0;
//
//        while(i <= n) {
//            sum+=i;
//
//            i++;
//        }
//        System.out.println(sum);
        for (int i = n; i <= n; i++){
            for (int j = 1; j <= 10; j++)
                System.out.println(i*j);
        }
    }
}
