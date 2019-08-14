package test4a;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        int  x1,x2,y1,y2;
        float d;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap hoanh do diem A: ");
        x1=sc.nextInt();
        System.out.println("nhap tung do do diem A: ");
        y1=sc.nextInt();
        System.out.println("nhap hoanh do diem B: ");
        x2=sc.nextInt();
        System.out.println("nhap tung do diem B: ");
        y2=sc.nextInt();
        d=(float) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("Do dai 2 diem A va B = "+Math.ceil(d*1000)/1000);

    }
}
