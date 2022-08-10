package com.Abhi;

public class StriBuild {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Tony");
//        System.out.println(str);
//        System.out.println(str.charAt(3));
//        str.setCharAt(1,'B');
//        System.out.println(str);
//        str.insert(7,'k');
//        System.out.println(str);
//        str.append('s');
//        str.append('a');
//        str.append('h');
//        System.out.println(str);
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
