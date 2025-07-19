package com.alibiner.ZooManagementSystem.Animal;

import com.alibiner.ZooManagementSystem.Enums.Animal.DietType;
import com.alibiner.ZooManagementSystem.Enums.Animal.Habitat;
import com.alibiner.ZooManagementSystem.Enums.General.Gender;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Horse extends Equidae{
    private String breed;            // örn: "Arabian"
    private boolean usedForRacing;
    private boolean usedForWork;

    public Horse(String name, float weight, LocalDate birthDate, Gender gender, Habitat habitat, DietType dietType, String color, String breed, boolean usedForRacing, boolean usedForWork) {
        super(name, weight, birthDate, gender, habitat, dietType, color);
        this.breed = breed;
        this.usedForRacing = usedForRacing;
        this.usedForWork = usedForWork;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed.isEmpty())
            throw new IllegalArgumentException("At'ın cins bilgisi boş bırakılamaz.");
        this.breed = breed;
    }

    public boolean isUsedForRacing() {
        return usedForRacing;
    }

    public void setUsedForRacing(boolean usedForRacing) {
        this.usedForRacing = usedForRacing;
    }

    public boolean isUsedForWork() {
        return usedForWork;
    }

    public void setUsedForWork(boolean usedForWork) {
        this.usedForWork = usedForWork;
    }

    @Override
    public float getDosage(float dosagePerKilogram) {
        float dosage = super.getWeight() * dosagePerKilogram;
        return dosage;
    }

    @Override
    public List<LocalTime> getFeedSchedules() {
        List<LocalTime> feedSchedule = new ArrayList<>();
        for (int i = 0; i < 24; i+=12) {
            feedSchedule.add(LocalTime.of(i,0));
        }
        return feedSchedule;
    }

    @Override
    public String toString() {
        return "Horse{" +
                super.toString()+ "\n" +
                ", breed='" + breed + '\'' + "\n" +
                ", usedForRacing=" + usedForRacing + "\n" +
                ", usedForWork=" + usedForWork + "\n" +
                '}';
    }
}
