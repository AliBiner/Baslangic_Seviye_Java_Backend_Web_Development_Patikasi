# Ödev
Aynı projeye mod almak ve dikdörtgen alan çevre hesabını yapan metotları yazıp menüde işlevsel hale getiriniz.

### Cevap:

    public static void mod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bölünen sayıyı giriniz: ");
        int dividend = scanner.nextInt();
        System.out.print("Bölen sayıyı giriniz: ");
        int divisor = scanner.nextInt();

        int result = dividend % divisor;
        System.out.println("Sonuç: " + result);
    }

    public static void rectangleAreaAndPerimeter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        int shortBorder = scanner.nextInt();
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        int longBorder = scanner.nextInt();

        int perimeter = (shortBorder + longBorder) * 2;
        int area = shortBorder * longBorder;

        System.out.println("Dikdörtgenin Alanı= " + area );
        System.out.println("Dikdörtgenin Çevresi = " + perimeter );
    }