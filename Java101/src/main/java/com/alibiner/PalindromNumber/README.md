# Pratik:
Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....

### Algoritma:
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

### Çıktı:

    8888 Palindrom bir sayıdır.
---
    8889 Palindrom bir sayı değildir.
