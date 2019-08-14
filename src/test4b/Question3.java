package test4b;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so luong dien tieu thu trong 1 thang: ");
        a=sc.nextInt();
        if(a<=50){
            System.out.println("tien dien cua thang do = "+a*550+"đ");
        }else if(a>50 && a<=100){
            System.out.println("tien dien cua thang do = "+(50*550+(a-50)*850)+"đ");
        }else if(a>100 && a<=200){
            System.out.println("tien dien cua thang do = "+(50*550+50*850+(a-50-50)*1200)+"đ");
        }else {
            System.out.println("tien dien cua thang do = "+(50*550+50*850+100*1200+(a-50-50-100)*1500)+"đ");
        }
    }
}
