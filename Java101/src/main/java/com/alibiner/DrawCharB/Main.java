package com.alibiner.DrawCharB;

public class Main {
    public static void main(String[] args) {
        char[][] bArray = new char[7][4];

        for (int i = 0; i < bArray.length ; i++) {
            for (int j = 0; j < bArray[i].length; j++) {
                if (i==0 || i==3 || i == 6)
                    bArray[i][j] = '*';
                else {
                    if (j==0 || j==bArray[i].length-1)
                        bArray[i][j] = '*';
                    else
                        bArray[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < bArray.length; i++) {
            for (int j = 0; j <bArray[i].length ; j++) {
                System.out.print(bArray[i][j] + " ");
            }
            System.out.println();
        }


    }
}
