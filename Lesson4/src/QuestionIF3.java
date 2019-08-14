import java.util.Scanner;

public class QuestionIF3 {
    public static void main(String[] args) {
        System.out.println("Input amount of electricity used: ");
        int e;
        Scanner in = new Scanner(System.in);
        e = in.nextInt();

        if(e <= 50 ){
            System.out.println("Amount of money must be paid: " +e*550 +" dong.");

        }
        else if (e > 50 && e <= 100){
            int result = 50*550 + (e-50)*850;
            System.out.println("Amount of money must be paid: " +result+" dong.");
        }
        else if( e > 100 && e <= 200){
            int result2 = 50*550 + 50*850 + (200-e)*1200;
            System.out.println("Amount of money must be paid: " +result2+" dong.");
        }
        else if( e > 200 ){
            int result3 = 50*550 + 50*850 + 100*1200 + (e-200)*1500;
            System.out.println("Amount of money must be paid: " +result3+" dong." );
        }
    }
}
