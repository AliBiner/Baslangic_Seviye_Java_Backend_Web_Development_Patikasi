# Boks Maçı

Java Sınıflar ile boks maçını simüle eden programı yazıyoruz.

## Ödev
Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplayan sistemi entegre ediniz.

### Cevap:

Eğer maçlar başlamadan önce hangi dövüşçünün önce başlayacağı bilinmesi gerekiyorsa bu özelliğin Fighter sınıfına eklenemesi doğrudur. 

Eğer maç başladığı anda yazı tura atarak hangi dövüşçünün ilk başlayacağını kontrol edeceksek. Ring sınıfının içinde bunun kontrol edilmesi ve run method'una entegre edilmesi daha doğrudur.

### Ring sınıfına eklenen nitelikler:
- startFighter
- secondFighter

#### Hangi dövüşçünün başlayacağını seçen method:
    public void whichStartFighter(){
        boolean change = Math.random() < 0.5;
        if (change) {
            this.startFighter = f1;
            this.secondFighter = f2;
        }
        else {
            this.startFighter = f2;
            this.secondFighter = f1;
        }
    }

#### Ring sınıfında yenilenen run methodu:
    public void run() {

        if (checkWeight()) {
            // hangi dövüşçünün başlayacağına karar verilir.
            whichStartFighter(); 
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");

                // ilk başlayacak dövüşçü 2. dövüşçüye hasar verir.
                secondFighter.health = startFighter.hit(secondFighter); 
                if (isWin())
                    break;

                // 2. dövüşçü 1. dövüşçüye hasar verir.
                startFighter.health = secondFighter.hit(startFighter); 
                if (isWin())
                    break;
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }