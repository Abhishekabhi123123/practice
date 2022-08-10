package com.Abhi;

public class linearSearch {
    public static void main(String[] args) {

        String str = "Abhishek";
        char target = 'e';
        int ans = Srin(str,target);
        System.out.println(ans);


//        int[] arr = {1,34,22,2,-1,44,24,15,88};
//        int y = 20;
//        int ans = linearSearch1(arr,y);
//        System.out.println(ans);

//        Scanner scan = new Scanner(System.in);
//
//        int[] a = new int[5];
//
//        for (int i = 0;i < a.length;i++){
//            a[i] = scan.nextInt();
//        }
//        int x = scan.nextInt();
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == x){
//                System.out.println("The index of x is: "+i);
//            }
//        }

    }

    static int linearSearch1(int[] arr, int x) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (a == x) {
                return i;
            }
        }
        return -1;
    }

    static int Srin(String str, char x){
        if (str.length() == 0) {
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            int y = str.charAt(i);
            if (x == y){
                return i;
            }
        }
        return -1;
    }
}
