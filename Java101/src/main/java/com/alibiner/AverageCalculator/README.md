# Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

### Cevap:
    long sum=0;
    long count=0;
    for (int i = 1; i <= input; i++) {
    if (i%3==0 && i%4==0){
    sum = sum + i;
    count++;
    System.out.println(i);
    }
    }
    long avarage = sum / count;