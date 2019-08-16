package com.k003.cfl.les4.pack1.src.simple1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lesson1: \n");
        lesson1();
        System.out.println("\nLesson2: \n");
        lesson2();
        System.out.println("\nLesson3: \n");
        lesson3();
        System.out.println("\nLesson4: \n");
        lesson4();
        System.out.println("\nLesson5: \n");
        lesson5();
        System.out.println("\nLesson6: \n");
        lesson6();
        System.out.println("\nLesson7: \n");
        lesson7();
        System.out.println("\nLesson8: \n");
        lesson8();

    }
    public static void lesson1(){
        System.out.println("Equation: a*x + b = 0");
        Scanner scan = new Scanner(System.in);
        double x;
        System.out.println("a = ");
        double a = scan.nextDouble();
        System.out.println("b =" );
        double b = scan.nextDouble();
        System.out.println("x = " + Math.rint(-(b/a)*100)/100);
    }
    public static void lesson2(){
        System.out.println("Equation: a*x^2 + b*x + c = 0");
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
    public static void lesson3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("n = ");
        int n = scan.nextInt();
        if(n % 400 == 0 || n % 4 == 0 && n % 100 != 0){
            System.out.println("Nam co 366 ngay");
        }else
            System.out.println("Nam co 365 ngay");
    }
    public static void lesson4(){
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
    public static void lesson5(){
        Scanner scan = new Scanner(System.in);
        double a,b,c;
        System.out.println("a,b,c = ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        if(a + b > c && a + c > b && b + c > a && ( a != 0 || b != 0 || c != 0)){
            System.out.println("Triangle");
            double p = (a + b + c) / 2;
            System.out.println("S = " + Math.sqrt(p * ( p - a ) * ( p - b ) * ( p - c )));
        }
        else
            System.out.println("Not the triangle");
    }
    public static void lesson6(){
        Scanner scan = new Scanner(System.in);
        double a , b;
        System.out.println(" a , b = ");
        a = scan.nextInt();
        b = scan.nextInt();
        double c , d;
        System.out.println(" c , d = ");
        c = scan.nextInt();
        d = scan.nextInt();
        System.out.println("AB = " + Math.sqrt(Math.pow(c-a,2) + Math.pow(d-b,2)));
    }
    public static void lesson7(){
        Scanner scan = new Scanner(System.in);
        double xA, yA;
        System.out.println("xA, yA = ");
        xA = scan.nextInt();
        yA = scan.nextInt();
        double r = Math.sqrt(Math.pow(xA,2) + Math.pow(yA,2));
        if(r < 1)
            System.out.println("Inside the circle");
        else
            System.out.println("Outside the circle");
    }
    public static void lesson8(){
        System.out.println("Ki tu: ");
        Scanner scan = new Scanner(System.in);
        char x = scan.next().charAt(0);
        if(x >= 'a' && x <= 'z' && x >= 'A' && x <= 'z')
            System.out.println("Ki tu la chu");
        else if (x >= '0' && x <= '9')
            System.out.println("Ki tu la so");
        else
            System.out.println("Ki tu khac");
    }
}
