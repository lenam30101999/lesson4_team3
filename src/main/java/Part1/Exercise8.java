package Part1;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class Exercise8 {
    public static void main(String[] args) {
        char ch;
        System.out.print("Nhập vào 1 kí tự: ");
        Scanner input = new Scanner(System.in);
        ch = input.next().charAt(0);
        testCharacter(ch);
    }
    public static void testCharacter(char ch){
        if(isDigit(ch))
            System.out.println("Đây là chữ số");
        else if(isLetter(ch))
            System.out.println("Đây là chữ cái");
        else
            System.out.println("Đây là kí tự khác");
    }
}
