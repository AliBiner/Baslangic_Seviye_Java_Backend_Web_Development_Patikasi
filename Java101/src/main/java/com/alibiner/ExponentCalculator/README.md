# Ödev

Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

---

## Cevap:

        System.out.print("Üssü alınacak sayı giriniz: ");
        int n = scanner.nextInt();

        System.out.print("Üs olacak sayı: ");
        int k = scanner.nextInt();

        long result = 1;
        
        for (int i = 0; i < k; i++) 
            result = result * n;