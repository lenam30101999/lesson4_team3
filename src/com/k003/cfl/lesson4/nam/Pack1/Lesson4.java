package com.k003.cfl.lesson4.nam.Pack1;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        int[] a;
        Scanner scan = new Scanner(System.in);
        a = new int [4];
        int max = 0;
        int min = a[0];
        for(int i = 0; i < 4; i++){
            System.out.println("Pt " + i + " = ");
            a[i] = scan.nextInt();
            max = (a[i] > max) ? a[i] : max;
            min = (a[i] < min) ? a[i] : min;
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
