import java.util.Scanner;

public class QuestionIF1 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Input 2 integers and operator (+,-,*,/) : ");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        a = in.nextInt();
        System.out.print("Input b: ");
        b = in.nextInt();

        System.out.println("Input an operator: ");
        char c;
        int hieu= a-b;
        int tong= a+b;
        int tich=a*b;
        int thuong=a/b;

        c = in.next().charAt(0);


        if(c == '+'){
            System.out.println("Result = " + tong);
        }
        if(c == '-'){
            System.out.println("Result = " +hieu);
        }
        if(c == '*'){
            System.out.println("Result = "+ tich);
        }
        if(c == '/'){
            System.out.println("Result = " + thuong);
        }
    }
}
