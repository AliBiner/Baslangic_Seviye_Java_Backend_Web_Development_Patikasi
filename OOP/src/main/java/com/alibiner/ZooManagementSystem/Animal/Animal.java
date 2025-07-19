package com.alibiner.ZooManagementSystem.Animal;

import com.alibiner.ZooManagementSystem.Enums.Animal.DietType;
import com.alibiner.ZooManagementSystem.Enums.Animal.Habitat;
import com.alibiner.ZooManagementSystem.Enums.General.Gender;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public abstract class Animal {
    private String name;
    private float weight;
    private LocalDate birthDate;
    private Gender gender;
    private Habitat habitat;
    private DietType dietType;
    private String color;

    public Animal(String name, float weight, LocalDate birthDate, Gender gender, Habitat habitat, DietType dietType, String color) {
        setName(name);
        setWeight(weight);
        setBirthDate(birthDate);
        setGender(gender);
        setHabitat(habitat);
        setDietType(dietType);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.length()<3)
            throw new IllegalArgumentException("Hayvan ismi 3 karakterden az olamaz.");
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight<0)
            throw new IllegalArgumentException("Hayvanın ağırlığı negatif olamaz.");
        this.weight = weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    private void setGender(Gender gender) {
        this.gender = gender;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    private void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public DietType getDietType() {
        return dietType;
    }

    private void setDietType(DietType dietType) {
        this.dietType = dietType;
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        if (color.isEmpty())
            throw new IllegalArgumentException("Hayvanın renk bilgisi boş bırakılamaz.");
        this.color = color;
    }

    public int getAgeAsMonth(){
        return LocalDate.now().getMonth().compareTo(getBirthDate().getMonth());
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' + "\n" +
                ", weight=" + weight + "\n" +
                ", birthDate=" + birthDate + "\n" +
                ", gender=" + gender + "\n" +
                ", habitat=" + habitat + "\n" +
                ", dietType=" + dietType + "\n" +
                ", color='" + color + '\'';
    }

    public abstract float getDosage (float dosagePerKilogram);
    public abstract List<LocalTime> getFeedSchedules();
}
