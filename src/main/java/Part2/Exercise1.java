package Part2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int a, b;
        char ch;
        System.out.print("Nhập vào 2 số nguyên a, b và dấu: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        ch = input.next().charAt(0);
        caculateValue(a, b, ch);
    }
    public static void caculateValue(int a, int b, char ch){
        float result = 0f;
        if(ch == '+') result = a + b;
        if(ch == '-') result = a - b;
        if(ch == '*') result = a * b;
        if(ch == '/'){
            if(a > b) result = (float) a / b ;
            else if(a == b) result = 1;
            else result = (float) b / a;
        }
        System.out.println("Giá trị của phép toán là: " + result);
    }
}
