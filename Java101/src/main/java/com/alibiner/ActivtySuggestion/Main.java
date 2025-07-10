package com.alibiner.ActivtySuggestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        boolean isSunny = new Random().nextBoolean();
        boolean isRaining = new Random().nextBoolean();
        boolean isEvening = new Random().nextBoolean();
        byte windSpeed = (byte) (Math.random() * 100);
        byte humidity = (byte) (Math.random() * 100);
        byte temperature = (byte) (( new Random().nextBoolean() ? Math.random() * -10  : Math.random() * 40));

        List<String> activities = new ArrayList<>();

        if (temperature <= 0)
            activities.add("Evde sıcak çikolata ile film keyfi");
        if (temperature > 0 && temperature <= 5 && isSunny)
            activities.add("Montunu giyip güneşli havada kısa bir yürüyüş");
        if (temperature > 0 && temperature <= 10 && windSpeed > 25)
            activities.add("Bir kafeye geçip sıcak bir içecek eşliğinde kitap oku");
        if (temperature > 10 && temperature <= 17 && isRaining)
            activities.add("Evde müzik dinleyip yaratıcı bir şeyler (örneğin resim)");
        if (temperature >= 15 && temperature <= 20 && isSunny)
            activities.add("Bisiklet turu ya da doğa yürüyüşü");
        if (temperature > 20 && temperature <= 30 && humidity > 70)
            activities.add("Serinlemek için AVM'de gez veya sinemaya git");
        if (temperature >= 25 && temperature <= 32 && windSpeed > 30)
            activities.add("Uçurtma uçur veya rüzgarlı sahilde yürüyüş yap");
        if (temperature >= 33 && temperature <= 38)
            activities.add("Gölgelik alanlarda dinlen, bol su iç ve dondurma ye");
        if (temperature > 38 && humidity > 60)
            activities.add("Dışarı çıkma, klimalı ortamda serinlemeye çalış");
        if (temperature >= 18 && temperature <= 23 && isEvening)
            activities.add("Açık hava konserine git veya çay bahçesinde otur");

        System.out.println("Yapabileceğiniz aktiviteler:");
        byte i = 0;
        for (String activity : activities){
            System.out.println(i + 1 + "-) " + activity + "," );
        }
    }
}
