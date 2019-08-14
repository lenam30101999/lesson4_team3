package com.k003.cfl.lesson4.nam.Pack1;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n = ");
        int n = scan.nextInt();
        if(n % 400 == 0 || n % 4 == 0 && n % 100 != 0){
            System.out.println("Nam co 366 ngay");
        }else
            System.out.println("Nam co 365 ngay");
    }
}
