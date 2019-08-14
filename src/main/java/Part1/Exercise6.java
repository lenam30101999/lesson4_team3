package Part1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int[] a = new int[3], b = new int[3];
        System.out.println("Nhập tọa độ điểm A: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++)
            a[i] = input.nextInt();
        System.out.println("Nhập tọa độ điểm B: ");
        for (int i = 0; i < 2; i++)
            b[i] = input.nextInt();
        calculateLength(a, b);
    }
    public static void calculateLength(int[] a, int[] b){
        float result;
        result = (float) Math.sqrt(Math.pow((b[1] - a[1]), 2) + Math.pow((b[2] - a[2]), 2));
        System.out.println("Khoảng cách giữa 2 điểm là: " + result);
    }
}
