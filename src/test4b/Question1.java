package test4b;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,s;
        System.out.println("Nhap so a: ");
        a=sc.nextDouble();
        System.out.println("Nhap so b: ");
        b=sc.nextDouble();
        System.out.println("Nhap dau cho phep tinh a va b");
        char x= sc.next().charAt(0);
        if(x == '+'){
            System.out.println("Ket qua = " +a+b);
        }else if(x=='-'){
            System.out.println("Ket qua = "+(a-b));
        }else if(x=='*'){
            System.out.println("Ket qua = " +a*b);
        }else if(x==':'){
            System.out.println("Ket qua = " +Math.ceil((a/b)*1000)/1000);
        }else{
            System.out.println("Moi ban nhap lai ki tu ");
        }
    }
}
