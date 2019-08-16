package com.k003.cfl.les4.pack2.src.simple1;
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
    }
    public static void lesson1(){
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
    public static void lesson2(){
        System.out.println("Nhap vao ngay: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
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
    public static void lesson3(){
        System.out.println("So luong dien tieu thu: ");
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();
        int money = 0;
        if(quantity <= 50){
            money = 550 * quantity;
        }
        else if(quantity > 50 && quantity <= 100){
            money = 550 * 550 + 850 * (quantity - 50);
        }
        else if(quantity > 100 && quantity <= 200){
            money = 550 * 50 + 850 * 50 + 1200 * (quantity - 100);
        }
        else money = 550 * 50 + 850 * 50 + 1200 * 100 + 1500 * (quantity - 200);
        System.out.println("Gia tien: " + money);
    }
    public static void lesson4(){
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
