package Part1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap n: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        numberOfDays(n);
    }
    public static void numberOfDays(int n){
        if(n % 400 == 0 || ((n % 4 == 0) && (n % 100 != 0))){
            System.out.println("Năm " + n + " có 366 ngày");
        }
        else System.out.println("Năm " + n + " có 365 ngày");
    }
}
