package test4a;
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b;
        float d;
        System.out.println("Nhap hoanh do diem A: ");
        a=sc.nextDouble();
        System.out.println("Nhap tung do diem A: ");
        b=sc.nextDouble();
        d = (float) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        if(d<1){
            System.out.println("Diem A nam trong duong tron tam 0 co r=1 ");
        }else {
            System.out.println("Diem A khong nam trong duong tron tam 0 co r=1");
        }

    }
}
