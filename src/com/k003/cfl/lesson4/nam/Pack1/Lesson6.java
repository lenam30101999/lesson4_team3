package com.k003.cfl.lesson4.nam.Pack1;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double xA , yA;
        System.out.println(" xA , yA = ");
        xA = scan.nextInt();
        yA = scan.nextInt();
        double xB , yB;
        System.out.println(" xB , yB = ");
        xB = scan.nextInt();
        yB = scan.nextInt();
        System.out.println("AB = " + Math.sqrt(Math.pow(xB-xA,2) + Math.pow(yB-yA,2)));
    }
}
