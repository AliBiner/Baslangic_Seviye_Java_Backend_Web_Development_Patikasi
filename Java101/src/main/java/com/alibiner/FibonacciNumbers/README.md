# Ödev - Fibonacci Serisi
Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

### Fibonacci Serisi Nedir ?
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34

    0 + 1 = 1
    
    1 + 1 = 2
    
    1 + 2 = 3
    
    2 + 3 = 5
    
    3 + 5 = 8
    
    5 + 8 = 13
    
    13 + 8 = 21
    
    21 + 13 = 34

### Algoritma:

        int firstFibonacci = 0;
        int secondFibonacci = 1;
        for (int i = 0; i <= input; i++) {
            if (i == 0)
                System.out.println(firstFibonacci);
            else if (i==1) {
                System.out.println(secondFibonacci);
            }else {
                int temp = secondFibonacci;
                secondFibonacci += firstFibonacci;
                System.out.println(secondFibonacci);
                firstFibonacci=temp;
            }
        }

### Çıktı:

    Fibonacci seri sayısı giriniz: 11
    0 1 1 2 3 5 8 13 21 34 55 89 