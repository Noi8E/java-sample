package com.noi8e;

import java.util.UUID;

public class Trainer {
    private UUID id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private GenderType gender;
    private TrainArea trainArea;

    public UUID getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public TrainArea getTrainArea() {
        return trainArea;
    }

    public void setTrainArea(TrainArea trainArea) {
        this.trainArea = trainArea;
    }

    public Trainer(String firstName, String lastName, String phoneNumber, String address, GenderType gender, TrainArea trainArea) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.trainArea = trainArea;
    }

    public Trainer() {
        this.id = UUID.randomUUID();
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

}
