package test4b;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay cua thang 3: ");
        int a = sc.nextInt();
        int n;
        n=(a+6)%7;
        if(n==0){
            System.out.println("ngay "+a+" la thu 7");
        }else if(n==1){
            System.out.println("ngay "+a+" la chu nhat");
        }else{
            System.out.println("ngay "+a+" la thu "+n);
        }
    }
}