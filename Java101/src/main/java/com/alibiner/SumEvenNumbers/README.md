# Ödev

Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

## Cevap:
    long input;
    long sumEvenNumber = 0;
    do {
    System.out.print("Bir sayı giriniz: ");
    input = scanner.nextLong();
    if (input % 2 ==1)
    break;
    else if (input % 2==0 && input%4==0)
    sumEvenNumber += input;
    }while (!(input % 2 ==1));