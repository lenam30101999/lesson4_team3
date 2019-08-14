package com.k003.cfl.lesson4.nam.Pack2;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println("Nhap 3 canh tam giac: ");
        Scanner scan= new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if(a + b > c && a + c > b && b + c > a){
            if ( a == b && b == c)
                System.out.println("Tam giac la deu");
            else if (a == b || b == c || a == c){
                if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) || Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2) || Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2))
                    System.out.println("Tam giac vuong can");
                else System.out.println("Tam giac can");
            }
            else if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) || Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2) || Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2))
                System.out.println("Tam giac vuong");
            else System.out.println("Tam giac thuong");
        }else System.out.println("K la tam giac");
    }
}
