import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int a,b,c;
        float x;
        System.out.println("Input a,b,c of three degree equation  ax^2 + bx + c = 0 : ");
        Scanner input = new Scanner(System.in);
        System.out.print("Input a:  ");
        a = input.nextInt();

        System.out.print("Input b: ");
        b = input.nextInt();

        System.out.print("Input c: " );
        c = input.nextInt();

        System.out.println("You just input: a = "+ a + " b = "+ b + " c = " + c);

        float delta = b*b - 4*a*c;

        if (a==0){
            System.out.println("You input wrong condition. Condition: a # 0! ");
        }
        else if(delta < 0) {
            System.out.println("Equation is no root! ");
        }
        else if(delta == 0 ){
                System.out.println("Equation have double root: x1 = x2 = " + -b/2*a);
            }
        else if(delta > 0){
                System.out.println("Equation have two root different x1 = " + (-b+ Math.sqrt(delta)/2*a +
                                    " x2 = " + (-b - Math.sqrt(delta))/2*a));
            }
        }
    }

