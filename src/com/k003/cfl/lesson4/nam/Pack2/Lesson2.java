package com.k003.cfl.lesson4.nam.Pack2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Nhap vao ngay: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        /*
            int thu = n % 7 + 6;
            if(thu > 7) thu = thu % 7;
            System.out.println("thu");
        */
        int t = n;
        int day = 7;
        while(n!=1){
            n--;
            day++;
            if(day==9)  day=2;
        }
        if( day == 8 )
            System.out.println("Ngay " + t + "/3/2008 la CN ");
        else
            System.out.println("Ngay " + t + "/3/2008 la thu " + day);
    }
}
