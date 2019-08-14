package test4b;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        double a,b,c;
        double d,e,f;
       Scanner sc=new Scanner(System.in);
        System.out.println("nhap 3 canh cua tam giac: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();


         d= (float) Math.pow(b,2)+Math.pow(c,2);
         e= (float) Math.pow(a,2)+Math.pow(c,2);
         f= (float) Math.pow(a,2)+Math.pow(b,2);

        if(a==b&&b==c) {
            System.out.println("day la tam giac deu");
                }else if(a==b||a==c||b==c) {
            System.out.println("day la tam giac can");
            if ((c * c) == f || (b * b) == e ||  (a * a) == d) {
                System.out.println("day la tam giac vuong can");

            }
        } else {
            System.out.println("day la tam giac thuong");
        }

    }
}
