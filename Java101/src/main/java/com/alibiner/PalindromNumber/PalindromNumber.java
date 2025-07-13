package com.alibiner.PalindromNumber;

public class PalindromNumber {
    public static void main(String[] args) {
        int number = 8889;
        System.out.println(isPalindrom(number) == true ? number + " Palindrom bir sayıdır." : number + " Palindrom bir sayı değildir." );
    }

    public static boolean isPalindrom(int number){
        int tempNumber = number;
        byte digitCount = 0;
        while (tempNumber != 0){
            digitCount++;
            tempNumber/=10;
        }
        byte[] digits = new byte[digitCount];
        tempNumber = number;
        for (int i = digitCount-1; i >= 0 ; i--) {
            digits[i] = (byte) (tempNumber % 10);
            tempNumber/=10;
        }

        byte firstDigitIndex = 0;
        byte lastDigitIndex = (byte) (digitCount-1);
        while (digits[firstDigitIndex] == digits[lastDigitIndex]) {
            if (firstDigitIndex == lastDigitIndex)
                break;
            firstDigitIndex++;
            lastDigitIndex--;
            return true;
        }
        return false;
    }
}
