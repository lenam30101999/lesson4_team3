import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        double a1,b1;
        int a2 = 0 ,b2 = 0;
        float d;
        System.out.println("Input coordinate of a point(a1,b1): ");
        Scanner input = new Scanner(System.in);
        System.out.print("Input a1: ");
        a1 = input.nextDouble();
        System.out.print("Input a2: ");
        b1 = input.nextDouble();

        d = (float) Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));
        if(d < 1 ){
            System.out.println("Point a inside circle.");
        }else
            System.out.println("Point a isn't inside circle.");
    }
}
