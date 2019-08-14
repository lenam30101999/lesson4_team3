import java.io.IOException;
import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) throws IOException {
        //bai1:
        int a;
        int b;
        float x;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a,b,c of equation two degree ax + b = 0 : ");

        System.out.println("Input a: ");
        a = input.nextInt();

        System.out.println("Input b: ");
        b = input.nextInt();

        System.out.println("You just input: a = " + a + ", b = " +b);

        if(a != 0 ){
            System.out.println("We have root X = " + -b/a );
        }else
                System.out.println("Wrong input! Condition a # 0. ");
    }
}
