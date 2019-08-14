package test4a;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        int a ,b,c;
        float p,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        a=sc.nextInt();
        System.out.println("Nhap canh a: ");
        b=sc.nextInt();
        System.out.println("Nhap canh a: ");
        c=sc.nextInt();
        if(a+b>c && b+c>a &&a+c>b ){
            System.out.println("3 canh vua nhap tao ra 1 tam giac");

        p = (float) (a+b+c)/2;
        s = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Dien tich tam giac = "+Math.ceil(s*1000)/1000);
    }else{
        System.out.println("3 canh vua cho khong tao ra 1 tam giac");
        }

    }
}
