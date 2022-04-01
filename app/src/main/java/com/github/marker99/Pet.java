package com.github.marker99;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "pet_table")
public class Pet {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String petName;
    private String birthday;
    private String race;
    private String gender;
    private String color;
    private String characteristics;

    public Pet(String petName, String birthday, String race, String gender, String color, String characteristics) {
        this.petName = petName;
        this.birthday = birthday;
        this.race = race;
        this.gender = gender;
        this.color = color;
        this.characteristics = characteristics;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
}
