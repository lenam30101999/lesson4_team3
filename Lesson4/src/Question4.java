import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        double a,b,c,d;
        double max1, max2,max;
        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
            a = input.nextDouble();
        System.out.print("Input b: ");
            b = input.nextDouble();
        System.out.print("Input c: ");
            c = input.nextDouble();
        System.out.print("Input d: ");
            d = input.nextDouble();

        max1 = (a > b) ? a : b;
        max2 = (c > d ) ? c : d;
        max = (max1 > max2 ) ? max1 : max2;

        System.out.println("The biggest volume of a,b,c,d: "+ max);
    }
}
