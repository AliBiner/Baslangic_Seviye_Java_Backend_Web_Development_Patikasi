package com.alibiner.ZooManagementSystem.Animal;

import com.alibiner.ZooManagementSystem.Enums.Animal.DietType;
import com.alibiner.ZooManagementSystem.Enums.Animal.Habitat;
import com.alibiner.ZooManagementSystem.Enums.General.Gender;

import java.time.LocalDate;

public abstract class Felidae extends Animal{
    private boolean hasClaws = true;
    private boolean hasWhiskers = true;
    private boolean canRoar;
    private double topSpeed;           // km/h
    private boolean isSolitaryHunter;  // yalnız mı avlanır?

    public Felidae(String name, float weight, LocalDate birthDate, Gender gender, Habitat habitat, DietType dietType, String color) {
        super(name, weight, birthDate, gender, habitat, dietType, color);
    }

    public boolean isHasClaws() {
        return hasClaws;
    }

    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }

    public boolean isHasWhiskers() {
        return hasWhiskers;
    }

    public void setHasWhiskers(boolean hasWhiskers) {
        this.hasWhiskers = hasWhiskers;
    }

    public boolean isCanRoar() {
        return canRoar;
    }

    public void setCanRoar(boolean canRoar) {
        this.canRoar = canRoar;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isSolitaryHunter() {
        return isSolitaryHunter;
    }

    public void setSolitaryHunter(boolean solitaryHunter) {
        isSolitaryHunter = solitaryHunter;
    }

    @Override
    public String toString() {
        return "Felidae{" +
                "hasClaws=" + hasClaws +
                ", hasWhiskers=" + hasWhiskers +
                ", canRoar=" + canRoar +
                ", topSpeed=" + topSpeed +
                ", isSolitaryHunter=" + isSolitaryHunter +
                '}';
    }
}
