package Part2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.print("Nhập độ dài 3 cạnh tam giác: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        testTriangle(a, b, c);

    }
    public static void testTriangle(int a, int b, int c){
        if(a + b > c && b + c > a && c + a > b){
            if(a == b && a == c)
                System.out.println("Tam giác đều");
            else if(a == b || a == c || b == c) {
                if((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) || (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)))
                    System.out.println("Tam giác vuông cân");
                else
                    System.out.println("Tam giác cân");
            }
            else
                System.out.println("Tam giác thường");
        }
        else
            System.out.println("Không phải 3 cạnh của 1 tam giác");
    }
}
