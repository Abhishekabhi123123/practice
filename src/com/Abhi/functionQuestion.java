package com.Abhi;

import java.util.Scanner;
import java.util.*;

public class functionQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();

//        boolean ans = isAmstrong(n);
//        System.out.println(isAmstrong(n));
        for (int i = 100; i < 1000; i++) {
            if (isAmstrong(i)) {

                System.out.println(i);
            }
        }
    }


    public static double averageNo() {
        System.out.print("Enter First no : ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.print("Enter Second no : ");
        double b = scan.nextDouble();
        System.out.print("enter Third no: ");
        double c = scan.nextDouble();

        double d = (a+b+c)/3;
//        System.out.println("The average of the three no is : "+d);
        return d;
    }

    public static void noA(){
        int positive = 0, negative = 0, zeros = 0;
      System.out.println("Press 1 to continue & 0 to stop");
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();

        while(input == 1) {
            System.out.println("Enter your number : ");
            int number = sc.nextInt();
            if(number > 0) {
                positive++;
            } else if(number < 0) {
                negative++;
            } else {
                zeros++;
            }

            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();
        }

        System.out.println("Positives : "+ positive);
        System.out.println("Negatives : "+ negative);
        System.out.println("Zeros : "+ zeros);
    }


    // COUNT NUMBERS

    public static void countNumber(){
        Scanner scan = new Scanner(System.in);
        int no;

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        char abhi;

        do{
            System.out.print("enter the nos to count: ");
            no = scan.nextInt();
            if (no < 0){
                negativeCount++;
            }
            else if (no > 0){
                positiveCount++;
            }
            else{
                zeroCount++;
            }

            System.out.print("Do you want to continue y/n ? : ");
            abhi = scan.next().charAt(0);
        }
        while(abhi == 'y');

        System.out.println("Positive = "+positiveCount);
        System.out.println("Negative = "+negativeCount);
        System.out.println("Zeros = "+zeroCount);
    }

    public static void abhi(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = scan.nextInt();

        System.out.print("Enter Y: ");
        int y = scan.nextInt();
        int result = 1;

       //  x^(y);
        for(int i = 1; i <= y; i++){
            result = result*x;

        }

        System.out.println(result);

    }
    static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        if (sum == original){
            return true;
        }
        return false;
    }
}