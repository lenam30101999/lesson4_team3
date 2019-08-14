import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1,b1,a2,b2;

        System.out.println("Input two coordinates a,b (a1,b1,a2,b2) : ");
        a1 = input.nextInt();
        b1 = input.nextInt();
        a2 = input.nextInt();
        b2 = input.nextInt();

        float d = (float) Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));
        System.out.println("Length coordinate a,b = " + d );
    }
}
