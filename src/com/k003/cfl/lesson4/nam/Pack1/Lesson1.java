package com.k003.cfl.lesson4.nam.Pack1;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args){
        System.out.println(" a*x + b = 0");
        Scanner scan = new Scanner(System.in);
        double x;
        System.out.println("a = ");
        double a = scan.nextDouble();
        System.out.println("b =" );
        double b = scan.nextDouble();
        System.out.println("x = " + Math.rint(-(b/a)*100)/100);
    }
}
