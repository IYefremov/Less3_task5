
//Write a function which calculates and returns the minimum of 4 arguments.
//public static void main(String[] args) {
//        // write your code here
//        }
//
//
//public static int min(int a, int b, int c, int d) {
//
//        }
//public static int min(int a, int b) {
//
//        }
//Function min(int a, int b, int c, int d) should use the function



package com.less3task5Package;

public class Minimum {

    public static void main(String[] args) {
        int x = 1;
        int y = -2;
        int z = -3;
        int q = 77;

        int minRes = min(x,y,z,q);
        System.out.println("The minimum among " + x + " " + y + " " + z + " " + q + " is: " + minRes);
    }


    public static int min(int a, int b, int c, int d) {

        return min(a, min(b, min(c, d)));

//        int minim = a;
//        int tmp;
//
//        tmp = min(a,b);
//        if (tmp < minim) {
//            minim = tmp;
//        }
//        tmp = min(minim, c);
//        if (tmp < minim){
//            minim = tmp;
//        }
//        tmp = min (minim, d);
//        if (tmp < minim){
//            minim = tmp;
//        }
//
//        return minim;
//        public static int min(int a, int b, int c, int d) {
//            return min(a, min(b, min(c,d)));
//        }
//
//        public static int min(int a, int b)
//        {
//            return a > b ? b : a;
//        }


    }

    public static int min(int a, int b) {
        return b < a ? b : a;

//        if (a < b){
//            return a;
//        } else return b;

    }

}


