package com.k003.cfl.lesson4.nam.Pack1;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double xA, yA;
        System.out.println("xA, yA = ");
        xA = scan.nextInt();
        yA = scan.nextInt();
        double r = Math.sqrt(Math.pow(xA,2) + Math.pow(yA,2));
        if(r < 1)
            System.out.println("Nam trong duong tron");
        else
            System.out.println("Nam ngoai duong tron");
    }
}
