package test4a;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        double x1,x2;
        System.out.println("nhap he so a cua phuong trinh bac 2: ");
        a = sc.nextInt();
        System.out.println("nhap he so b cua phuong trinh bac 2: ");
        b=sc.nextInt();
        System.out.println("nhap he so c cua phuong trinh bac 2: ");
        c=sc.nextInt();
        d = b*b - 4*a*c;


        System.out.println("Gia trinh cua delta: " +d);
        if(d<0){
                System.out.println("phuong trinh da cho vo nghiem");
                if(d==0){
                System.out.println("phuong trinh da cho cp nghiem kep x1 = x2 = "+ Math.ceil((-b/2*a)*1000)/1000);
                    }
                }else {
                System.out.println("phuong trinh co 2 nghiem phan biet: x1 = "+ Math.ceil(((-b + Math.sqrt(d))/(2*a))*1000)/1000+ "\nx2 = "+ Math.ceil(((-b - Math.sqrt(d))/(2*a))*1000)/1000);

        }
    }
}
