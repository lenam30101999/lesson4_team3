import java.util.Scanner;

public class QuestionIF4 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Input 3 edge of a triangle: "); // triangle : tam giac
        System.out.print("Input a: ");
            a = input.nextFloat();
        System.out.print("Input b: ");
            b = input.nextFloat();
        System.out.print("Input c: ");
            c = input.nextFloat();

        if(a > b + c || b > a + c || c > b + a){
            System.out.println("Input Wrong Condition! Do again! ");
        }
            else if(a == b && b == c) {
                System.out.println("This is an equilateral triangle! "); // equilateral : deu
            }
             else if( a == b || b == c || c == a ) {
                System.out.println("This is an isosceles triangle!"); // isosceles : can
            }

        else System.out.println("This is a simple triangle! ");

        }
    }
