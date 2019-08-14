package com.k003.cfl.lesson4.nam.Pack2;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        System.out.println("So luong dien tieu thu: ");
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();
        int money = 0;
        if(quantity <= 50){
            money = 550 * quantity;
        }
        else if(quantity > 50 && quantity <= 100){
            money = 550 * 550 + 850 * (quantity - 50);
        }
        else if(quantity > 100 && quantity <= 200){
            money = 550 * 50 + 850 * 50 + 1200 * (quantity - 100);
        }
        else money = 550 * 50 + 850 * 50 + 1200 * 100 + 1500 * (quantity - 200);
        System.out.println("Gia tien: " + money);
    }
}
