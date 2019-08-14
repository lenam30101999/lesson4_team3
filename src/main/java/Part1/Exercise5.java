package Part1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        float a, b, c, result;
        System.out.println("Nhập độ dài 3 đoạn: ");
        Scanner input = new Scanner(System.in);
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        if(isTriangle(a, b, c)){
            System.out.println("Chúng có thể tạo thành tam giác");
            result = triangleArea(a, b, c);
            System.out.println("Diện tích tam giác là: " + result);
        }
        else System.out.println("Chúng không thể tạo thành tam giác");
    }
    public static boolean isTriangle(float a, float b, float c){
        if(a + b > c && b + c >a && c + a > b)
            return true;
        return false;
    }
    public static float triangleArea(float a, float b, float c){
        float p = (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
