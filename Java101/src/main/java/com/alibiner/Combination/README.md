# Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)

---

## Cevap:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kombinasyonun Elaman sayısını (n) giriniz: "); //C(n,r) 1. değer = n
        int n = scanner.nextInt();
        System.out.print("Kombinasyonun Seçim sırasını (r) giriniz: "); //C(n,r) 2. değer = r
        int r = scanner.nextInt();

        //Formül: C(n,r) = n! / (r! * (n-r)!)
        long nFactorial = factorial(n);
        long rFactorial = factorial(r);
        long differenceN_R_Factorial = factorial(n-r);

        int result = (int) (nFactorial / (rFactorial * differenceN_R_Factorial));
        System.out.println(result);

    }

    public static long factorial(int number){
        long fact=1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }