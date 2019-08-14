import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int year;
        /*leap year : nam nhuan
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Input year : ");
        year = input.nextInt();

        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("Year "+ year + " is leep year");
        }
        else if(year % 400 == 0 && year % 100 == 0) {
            System.out.println("Year "+ year + " is leep year");
        }
        else
            System.out.println("Year " + year + " doesn't leep year! ");
    }
}
