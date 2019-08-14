import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        char a;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a character: ");
        a = input.next().charAt(0);

        if(a > 64 && a < 91 || a > 96 && a < 123 ){
            System.out.println("Character just input is word.");
        }
        else if(a > 47 && a < 58){
            System.out.println("Character just input is number. ");
        }else
            System.out.println("Character just input is other characters");
    }
}
