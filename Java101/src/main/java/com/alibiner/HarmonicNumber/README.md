Java ile girilen sayının harmonik serisini bulan program yazacağız.

Harmonik Seri Formülü :
![harmonic_series.gif](harmonic_series.gif)

---

## Cevap:
        System.out.print("Sayı giriniz: ");
        long input = scanner.nextLong();

        float result = 0;
        for (float i = 1; i <= input ; i++)
            result += (float) 1/i;