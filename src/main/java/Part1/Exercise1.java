package Part1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int a, b;
        float result;
        System.out.println("Nhập a và b: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        result = firstOderEquation(a, b);
        System.out.println(result);
    }

    public static float firstOderEquation(int a, int b) {
        return (float) -b / a;
    }
}
