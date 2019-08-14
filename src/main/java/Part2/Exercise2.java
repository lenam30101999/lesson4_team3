package Part2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập vào 1 ngày trong tháng 3: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        printDay(n);
    }
    public static void printDay(int n){
        if(n == 1 || n == 8 || n == 15 || n == 22 || n== 29)
            System.out.println("Ngày " + n + " là thứ bảy");
        if(n == 2 || n == 9 || n == 16 || n == 23 || n== 30)
            System.out.println("Ngày " + n + " là chủ nhật");
        if(n == 3 || n == 10 || n == 17 || n == 24 || n== 31)
            System.out.println("Ngày " + n + " là thứ hai");
        if(n == 4 || n == 11 || n == 18 || n == 25)
            System.out.println("Ngày " + n + " là thứ ba");
        if(n == 5 || n == 12 || n == 19 || n == 26)
            System.out.println("Ngày " + n + " là thứ tư");
        if(n == 6 || n == 13 || n == 20 || n == 26)
            System.out.println("Ngày " + n + " là thứ năm");
        if(n == 7 || n == 14 || n == 21 || n == 27)
            System.out.println("Ngày " + n + " là thứ sáu");
    }
}
