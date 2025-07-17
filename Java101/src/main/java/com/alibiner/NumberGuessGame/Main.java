package com.alibiner.NumberGuessGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(101);

        int health = 5;
        int selected;
        boolean isWin = false;

        do {
            System.out.println("Lütfen 0-100 arasında bir sayı tahmin ediniz. Can(Health) : " + health);
            selected = scanner.nextInt();
            if (selected < 0 || selected > 100)
                continue;
            if (randomNumber==selected){
                System.out.println("Tahmin Edilen Sayı: " + randomNumber + " Kazandınız!");
                isWin = true;
                break;
            }else {
                health--;
                System.out.println("Doğru tahmin edemediniz. Can(Health) : " + health );
            }
        }while (health>0);
        if (!isWin)
            System.out.println("Canınız bitti. Kaybettiniz.");
    }
}
