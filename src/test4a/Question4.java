package test4a;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Nhap so nguyen a: ");
        a=sc.nextInt();
        System.out.println("Nhap so nguyen b: ");
        b=sc.nextInt();
        System.out.println("Nhap so nguyen c: ");
        c=sc.nextInt();
        System.out.println("Nhap so nguyen d: ");
        d=sc.nextInt();
        Integer [] x ={a,b,c,d};
        int min = (int) Collections.min(Arrays.asList(x));
        int max = (int) Collections.max(Arrays.asList(x));
        System.out.println("Min x = "+min);
        System.out.println("Max x = "+max);
    }
}
