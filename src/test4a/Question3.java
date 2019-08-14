package test4a;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap nam n can xet: ");
        n = sc.nextInt();
        if(n%400==0 || n%4==0 && n%100!=0 ){
            System.out.println("nam "+n+" la nam nhuan co 366 ngay" );
        } else if(n%400==0 && n%100==0){
            System.out.println("nam "+n+" la nam nhuan co 366 ngay" );
        } else {
            System.out.println("nam "+n+" la co 365 ngay" );
        }
    }
}