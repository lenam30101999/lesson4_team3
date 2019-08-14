import java.util.Scanner;

public class QuestionIF2 {
    public static void main(String[] args) {
        System.out.println("Input the day of March(1-31): ");
        Scanner in = new Scanner(System.in);
        int day;
        day = in.nextInt();

        int n = (day+6)%7;

        if( n == 0) {
            System.out.println("Day " + day + " is Saturday. ");
        }
        if( n == 1){
            System.out.println("Day " + day + " is Sunday. ");
        }
        if( n != 1 || n != 0){
            System.out.println("Day " + day + " is Thu " + n );
        }
    }
}
