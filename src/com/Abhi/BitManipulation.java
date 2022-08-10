package com.Abhi;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
     UpdatBit();
    }

    // GET BIT
    public static void GetBit(){
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1<<pos;

        if ((bitMask & n) == 0){
            System.out.println("Bit is Zero");
        }
        else
            System.out.println("Bit is one");
    }

    // SET BIT
    public static void SetBit(){
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        int no = bitMask | n;
        System.out.println(no);
    }

    // CLEAR BIT
    public static void ClearBit(){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBit = ~(bitMask);

        int no = notBit & n;
        System.out.println(no);
    }

    // UPDATE BIT
    public static void UpdatBit(){
        Scanner scan = new Scanner(System.in);
        int oper = scan.nextInt();
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;

        if (oper == 1){
            int no = bitmask | n;
            System.out.println(no);
        }
        else{
            int no = ~(bitmask);
            int newNumber = no & n;
            System.out.println(newNumber);
        }
    }
}
