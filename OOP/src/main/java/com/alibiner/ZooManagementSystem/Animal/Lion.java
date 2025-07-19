package com.alibiner.ZooManagementSystem.Animal;

import com.alibiner.ZooManagementSystem.Enums.Animal.DietType;
import com.alibiner.ZooManagementSystem.Enums.Animal.Habitat;
import com.alibiner.ZooManagementSystem.Enums.General.Gender;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Lion extends Felidae{
    private boolean isAlpha;           // sürü lideri mi?
    private boolean hasMane;           // erkeklerde yele var mı?

    public Lion(String name, float weight, LocalDate birthDate, Gender gender, Habitat habitat, DietType dietType, String color, boolean isAlpha, boolean hasMane) {
        super(name, weight, birthDate, gender, habitat, dietType, color);
        this.isAlpha = isAlpha;
        this.hasMane = hasMane;
    }

    public boolean isAlpha() {
        return isAlpha;
    }

    public void setAlpha(boolean alpha) {
        this.isAlpha = super.getGender() == Gender.ERKEK && alpha;
    }

    public boolean isHasMane() {
        return hasMane;
    }

    public void setHasMane(boolean hasMane) {
        this.hasMane = super.getGender() == Gender.ERKEK && hasMane;
    }

    @Override
    public float getDosage(float dosagePerKilogram) {
        if (isAlpha && isHasMane() && super.getWeight()>400)
            return 40;
        else
            return 5;
    }

    @Override
    public List<LocalTime> getFeedSchedules() {
        List<LocalTime> feedSchedules = new ArrayList<>();
        feedSchedules.add(LocalTime.of(18,30));
        return feedSchedules;
    }

    @Override
    public String toString() {
        return "Lion{" +
                super.toString() + "\n" +
                ", isAlpha=" + isAlpha + "\n" +
                ", hasMane=" + hasMane + "\n" +
                '}';
    }
}
