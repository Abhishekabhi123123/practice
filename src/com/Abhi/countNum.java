package com.Abhi;

import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int count = 0;
        while(n > 0){
            int rem = n%10;
            if(rem == 3) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
