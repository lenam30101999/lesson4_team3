package Part1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        double x, y;
        double length;
        System.out.print("Nhập tọa độ 1 điểm: ");
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();
        length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if(testPoint(length))
            System.out.println("Điểm này có nằm trong hình tròn tâm O bán kính bằng 1");
        else
            System.out.println("Điểm này không nằm trong hình tròn tâm O bán kính bằng 1");
    }
    public static boolean testPoint(double a){
        if(a <= 1) return true;
        return false;
    }
}
