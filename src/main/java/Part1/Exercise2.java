package Part1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Nhập a, b và c: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        quadratic(a, b, c);
    }
    public static void quadratic(int a, int b, int c){
        double delta = Math.pow(b, 2) - 4 * a * c;
        if(delta < 0) System.out.println("Phương trình vô nghiệm");
        else if(delta == 0){
            System.out.println("Phương trình có nghiệm kép: " + (float)(- b / (2 * a)));
        }
        else{
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println("x1 = " + (float)(- b + Math.sqrt(delta)) / (2 * a));
            System.out.println("x2 = " + (float)(- b - Math.sqrt(delta)) / (2 * a));
        }
    }
}

