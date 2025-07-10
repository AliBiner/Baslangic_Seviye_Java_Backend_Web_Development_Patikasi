# Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

---

## Cevap:
    long input = scanner.nextLong();

    for (int i = 1; i <= input; i*=4) {
        System.out.println("4'ün Katı : " + i);
    }
    for (int i = 1; i <= input; i*=5) {
        System.out.println("5'in Katı : "+ i);
    }

---

## Örnek: 

    Bir sayı giriniz: 100
    4'ün Katı : 1
    4'ün Katı : 4
    4'ün Katı : 16
    4'ün Katı : 64
    5'in Katı : 1
    5'in Katı : 5
    5'in Katı : 25