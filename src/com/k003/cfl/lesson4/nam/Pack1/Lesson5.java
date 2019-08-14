package com.k003.cfl.lesson4.nam.Pack1;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,c;
        System.out.println("a,b,c = ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        if(a + b > c && a + c > b && b + c > a && ( a != 0 || b != 0 || c != 0)){
            System.out.println("Co la tam giac");
            double p = (a + b + c) / 2;
            System.out.println("S = " + Math.sqrt(p * ( p - a ) * ( p - b ) * ( p - c )));
        }
        else
            System.out.println("K la tam giac");
    }
}
