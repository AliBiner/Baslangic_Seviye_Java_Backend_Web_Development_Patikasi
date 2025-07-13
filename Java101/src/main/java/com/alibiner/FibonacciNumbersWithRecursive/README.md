# Pratik - Recursive ile Fibonacci Serisi Bulan Program

### Algoritma:

    public static int firstFinonacci = 0;
    public static int secondFibonacci = 1;

    public static void fibonacci(int length){
        if (length<0)
            return;
        System.out.println(firstFinonacci);
        int temp = firstFinonacci;
        firstFinonacci += secondFibonacci;
        secondFibonacci = temp;
        fibonacci(length-1);
    }

### Çıktı: 

    0 1 1 2 3 5 8 13 21 34 55 89