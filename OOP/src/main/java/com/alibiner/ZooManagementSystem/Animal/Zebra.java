package com.alibiner.ZooManagementSystem.Animal;

import com.alibiner.ZooManagementSystem.Enums.Animal.DietType;
import com.alibiner.ZooManagementSystem.Enums.Animal.Habitat;
import com.alibiner.ZooManagementSystem.Enums.General.Gender;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Zebra extends Equidae {

    private String stripePattern;    // örn: "Vertical", "Horizontal"
    private boolean isAggressive;

    public Zebra(String name, float weight, LocalDate birthDate, Gender gender, Habitat habitat, DietType dietType, String color, String stripePattern) {
        super(name, weight, birthDate, gender, habitat, dietType, color);
        setStripePattern(stripePattern);
    }

    public String getStripePattern() {
        return stripePattern;
    }

    private void setStripePattern(String stripePattern) {
        if (stripePattern.isEmpty())
            throw new IllegalArgumentException("Zebra deseni boş bırakılamaz.");
        this.stripePattern = stripePattern;
    }

    public boolean isAggressive() {
        return isAggressive;
    }

    public void setAggressive(boolean aggressive) {
        isAggressive = aggressive;
    }

    @Override
    public float getDosage(float dosagePerKilogram) {
        return super.getGender() == Gender.DISI ? 1.0f : 5.0f;
    }

    @Override
    public List<LocalTime> getFeedSchedules() {
        List<LocalTime> feedSchedules = new ArrayList<>();
        for (int i = 0; i < 24; i+=4) {
            feedSchedules.add(LocalTime.of(i,30));
        }
        return feedSchedules;
    }


}
