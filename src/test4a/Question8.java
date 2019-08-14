package test4a;
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ki tu can xet: ");
        char x = sc.next().charAt(0);
        if(64 < x && x<91 || 96< x && x<123){
            System.out.println("Ki tu "+x+ " la mot chu cai");
        }else if(47<x && x <58){
            System.out.println("Ki tu "+x+" la mot chu so");
        }else{
            System.out.println("Ki tu "+x+" la mot ki tu");
        }


    }
}
