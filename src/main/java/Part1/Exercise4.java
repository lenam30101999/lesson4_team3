package Part1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int a, b, c, d;
        System.out.println("Nhập vào 4 số nguyên: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        findMaxNumber(a, b, c, d);
        findMinNumber(a, b, c, d);
    }
    public static void findMaxNumber(int a, int b, int c, int d){
        int result = Math.max(a, b);
        result = Math.max(result, c);
        result = Math.max(result, d);
        System.out.println("Số lớn nhất là: " + result);
    }
    public static void findMinNumber(int a, int b, int c, int d){
        int result = Math.min(a, b);
        result = Math.min(result, c);
        result = Math.min(result, d);
        System.out.println("Số nhỏ nhất là: " + result);
    }
}
