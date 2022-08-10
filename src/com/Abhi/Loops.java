package com.Abhi;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max1 = a;

        if (b > max1) {
            max1 = b;
        }
        if (c > max1) {
            max1 = c;
        }

        System.out.println(max1);
    }
}
