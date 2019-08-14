package com.k003.cfl.lesson4.nam.Pack1;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args){
        System.out.println("a*x^2 + b*x + c = 0");
        Scanner scan = new Scanner(System.in);
        double x;
        System.out.println("a = ");
        double a = scan.nextDouble();
        System.out.println("b = ");
        double b = scan.nextDouble();
        System.out.println("c = ");
        double c = scan.nextDouble();
        if(a==0){
            if(b==0)
                System.out.println("Phuong trinh vo nghiem");
            else{
                if(c==0) System.out.println("Phuong trinh vo so nghiem");
                else System.out.println("x = " + Math.rint(-(c/b)*100)/100);
            }
        }
        else{
            if(b==0){
                if(c==0)
                    System.out.println("x = 0");
                else if(c > 0)
                        System.out.println("Pt vo nghiem");
                else if (c < 0) {
                    System.out.println("x1 = " + Math.rint(Math.sqrt(-c/a)*100)/100);
                    System.out.println("x2 = " + Math.rint(-Math.sqrt(-c/a)*100)/100);
                }
            }
            else{
                if(c==0){
                    System.out.println("x1 = 0");
                    System.out.println("x2 = " + Math.rint(-(b/a)*100)/100);
                }
                else{
                    double delta = Math.pow(b,2) - 4 * a * c;
                    if( delta < 0 )
                        System.out.println("Pt vo nghiem");
                    else if ( delta == 0 )
                        System.out.println("x1 = x2 = " + -b/(2*a));
                    else {
                        System.out.println("x1= " + (-b + Math.sqrt(delta))/(2*a));
                        System.out.println("x2= " + (-b - Math.sqrt(delta))/(2*a));
                    }
                }
            }
        }
    }
}
