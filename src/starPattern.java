import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {
    table();
    }

    // SOLID RECTANGLE
    public static void solidRectangle() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    //HOLLOW RECTANGLE
    public static void hollowRectangle() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // HALF PYRAMID
    public static void halfPyramid(){
        for (int i = 1;i <= 5;i++){
            for (int j= 1;j <= i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    //inverted half pyramid(by 180 degree)
    public static void invertedHalfPyramid(){
        int n = 5;
        for (int i = 1;i <= n;i++){
            for (int j = 1;j <= n-i;j++){
                System.out.print("  ");
            }
            for (int k = 1;k <= i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // HALF PYRAMID WITH NUMBERS
    public static void halfPyramidNumbers(){
        for (int i = 1;i <= 5;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // FLOYD'S TRIANGLE
    public static void floydTriangle(){
        int n = 1;

        for (int i = 1;i <= 5;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }

    // O - 1 TRIANGLE
    public static void zeroOneTriangle(){
        for (int i = 1;i <= 5;i++){
            for (int j= 1;j <= i;j++){
                int sum = i+j;
                if (sum % 2 == 0){
                    System.out.print(" 1");
                } else{
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
    }

    public static void table(){
        System.out.print("Enter any no. : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1;i <= 10;i++) {
            System.out.println(n * i);
        }
    }
}


