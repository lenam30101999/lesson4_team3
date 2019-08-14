import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Input 3 edges of triangle: " );
        Scanner input = new Scanner(System.in);
        System.out.print("Input edge a: ");
        a = input.nextInt();
        System.out.print("Input edge b: ");
        b = input.nextInt();
        System.out.print("Input edge c: ");
        c = input.nextInt();

        if(a + b > c && b + c > a && c + a > b){
            System.out.println(+ a + " " + b + " " + c + " create a triangle.");
        }else
            System.out.println(+ a + " " + b + " " + c + " aren't create a triangle.");
    }
}
