package com.k003.cfl.lesson4.nam.Pack2;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ki tu: ");
        String x = scan.nextLine();
        System.out.println("a,b = ");
        a = scan.nextInt();
        b = scan.nextInt();
        if(x.equals("+"))
            System.out.println(" a + b = " + ( a + b ));
        else if (x.equals("-"))
            System.out.println(" a - b = " + ( a - b ));
        else if (x.equals("*"))
            System.out.println(" a * b = " + ( a * b ));
        else
            System.out.println(" a / b = " + ( a / b ));
    }
}
