package com.alibiner.ZooManagementSystem.Animal;

import com.alibiner.ZooManagementSystem.Enums.Animal.DietType;
import com.alibiner.ZooManagementSystem.Enums.Animal.Habitat;
import com.alibiner.ZooManagementSystem.Enums.General.Gender;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public abstract class Equidae extends Animal{
    private final int numberOfLegs = 4;
    private String hoofType;       // örn: "Single-toed"
    private boolean canBeRidden;
    private boolean hasMane;       // yele
    private double runningSpeed;

    public Equidae(String name, float weight, LocalDate birthDate, Gender gender, Habitat habitat, DietType dietType, String color) {
        super(name, weight, birthDate, gender, habitat, dietType, color);
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getHoofType() {
        return hoofType;
    }

    public void setHoofType(String hoofType) {
        this.hoofType = hoofType;
    }

    public boolean isCanBeRidden() {
        return canBeRidden;
    }

    public void setCanBeRidden(boolean canBeRidden) {
        this.canBeRidden = canBeRidden;
    }

    public boolean isHasMane() {
        return hasMane;
    }

    public void setHasMane(boolean hasMane) {
        this.hasMane = hasMane;
    }

    public double getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(double runningSpeed) {
        this.runningSpeed = runningSpeed;
    }


    @Override
    public String toString() {
        return  super.toString() + "\n" +
                ", numberOfLegs=" + numberOfLegs + "\n" +
                ", hoofType='" + hoofType + '\'' + "\n" +
                ", canBeRidden=" + canBeRidden + "\n" +
                ", hasMane=" + hasMane + "\n" +
                ", runningSpeed=" + runningSpeed;
    }
}
