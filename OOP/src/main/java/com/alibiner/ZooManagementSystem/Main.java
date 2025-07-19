package com.alibiner.ZooManagementSystem;

import com.alibiner.ZooManagementSystem.Animal.Horse;
import com.alibiner.ZooManagementSystem.Animal.Lion;
import com.alibiner.ZooManagementSystem.Animal.Zebra;
import com.alibiner.ZooManagementSystem.Enums.Animal.DietType;
import com.alibiner.ZooManagementSystem.Enums.Animal.Habitat;
import com.alibiner.ZooManagementSystem.Enums.General.Gender;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Horse horse = null;
        List<Zebra> zebras = new ArrayList<>();
        Lion lion= null;
        try {
            horse = new Horse("Cengizhan",100, LocalDate.of(2010,1,1), Gender.ERKEK, Habitat.CAYIR, DietType.OTCUL,
                    "Siyah","Arap",true,false);

            Zebra zebra = new Zebra("Ayşe",500,LocalDate.of(2000,1,1),Gender.DISI,Habitat.CAYIR,DietType.OTCUL,"Beyaz",
                    "Dikey");
            zebras.add(zebra);
            Zebra zebra1 = new Zebra("Ali",500,LocalDate.of(2000,1,1),Gender.ERKEK,Habitat.CAYIR,DietType.OTCUL,"Siyah",
                    "Yatay");
            zebras.add(zebra1);

            lion = new Lion("King Scarface",500,LocalDate.of(2000,1,1),Gender.ERKEK,Habitat.SAVANA,DietType.ETCIL,
                    "Kahverengi",
                    true,true);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }



        if (horse != null){
            System.out.println("İlaç Dozacı: " + horse.getDosage(0.2f));
            System.out.println("Beslenme Saatleri:");
            for (LocalTime schedule : horse.getFeedSchedules()){
                System.out.println("Saat: " + schedule + " mg");
            }
            System.out.println(horse.toString());
        }

        for (Zebra zebra : zebras){
            System.out.println("-------------");
            System.out.println(zebra.getName() + " ilaç dozacı : " + zebra.getDosage(0.4f));
            System.out.println(zebra.getName() + " Beslenme Zamanı: ");
            for (LocalTime feedSchedule : zebra.getFeedSchedules()){
                System.out.println(feedSchedule);
            }
            System.out.println(zebra.toString());
        }

        if (lion != null){
            System.out.println("-------------");
            System.out.println(lion.getName() + " ilaç dozacı : " + lion.getDosage(0.4f));
            System.out.println(lion.getName() + " Beslenme Zamanı: ");
            for (LocalTime feedSchedule : lion.getFeedSchedules()){
                System.out.println(feedSchedule);
            }
            System.out.println(lion.toString());
        }



    }
}
