package test4a;

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        int a, b;
        double x;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap he so a vao phuong trinh aX + b = 0: ");
        a = scanner.nextInt();
        System.out.println("Nhap he so  b vao phuong trinh aX + b = 0: ");
        b = scanner.nextInt();
         x = (float) -b/a;

        if(a !=0){
            System.out.println("phuong trinh da cho co nghiem duy nhat: X = "+Math.ceil(x *1000)/1000);
        }if(a==0) {
            if (b == 0) {
                System.out.println("phuong trinh da cho co vo so nghiem");
            } else {
                System.out.println("phuong trinh da cho vo nghiem");
            }
        }
    }
}
