package Part2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập vào só lượng điện tiêu thụ trong tháng: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        caculateMoney(n);
    }
    public static void caculateMoney(int n){
        int result = 0;
        if(n > 0 && n <= 50)
            result = n * 550;
        if(n > 50 && n <= 100)
            result = 50 * 550 + (n - 50) * 850;
        if(n > 100 && n <= 200)
            result = 50 * 550 + 50 * 850 + (n - 100) * 1200;
        if(n > 200)
            result = result = 50 * 550 + 50 * 850 + 100 * 1200 + (n - 200) * 1500;
        System.out.println("Số tiền phải trả là: " + result + "đ");
    }
}
