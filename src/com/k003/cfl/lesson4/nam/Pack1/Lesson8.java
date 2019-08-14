package com.k003.cfl.lesson4.nam.Pack1;

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        System.out.println("Ki tu: ");
        Scanner scan = new Scanner(System.in);
        char x = scan.next().charAt(0);
        /*if(x >= 65 && x <= 90 || x >= 97 && x <= 122)
            System.out.println("La chu");
        else if(x >=48 && x <= 57)
            System.out.println("La so");
        else System.out.println("Ky tu khac");*/
        if(x >= 'a' && x <= 'z' && x >= 'A' && x <= 'z')
            System.out.println("Ki tu la chu");
        else if (x >= '0' && x <= '9')
            System.out.println("Ki tu la so");
        else
            System.out.println("Ki tu khac");
    }
}
