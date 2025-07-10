# Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14

---
## Cevap:
        System.out.print("Sayı giriniz: ");
        long input = scanner.nextLong();
        long tempInput = input;

        byte digitsCount=0;

        while (tempInput % 10 != 0){
            tempInput /= 10;
            digitsCount++;
        }

        tempInput = input;

        int sumDigitNumbers=0;

        for (int i = 0; i < digitsCount; i++) {
            byte digitValue = (byte) (tempInput % 10);
            sumDigitNumbers += digitValue;
            tempInput /= 10;
        }