package com.alibiner.DrawDiamond;

public class DrawDiamond {
    public static void main(String[] args) {
        byte topStarCount = 9;
        byte middleStarCount = 15;
        byte tempTopStarCount = topStarCount;

        System.out.println();
        System.out.println("---------------------");
        System.out.println();
        System.out.println();

        for (int i = 0; i < (middleStarCount - topStarCount) / 2 ; i++) {
            for (int j = (middleStarCount-topStarCount) / 2 - i; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < tempTopStarCount ; j++) {
                System.out.print("*");
            }
            tempTopStarCount += 2;
            System.out.println();
        }
        for (int i = 0; i < middleStarCount; i+=2) {
            for (int j = 0; j <= i-2; j+=2) {
                System.out.print(" ");
            }
            for (int j = middleStarCount-i; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
