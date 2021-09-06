package com.noi8e;

public class Trainer {
    String firstName;
    String lastName;
    int phoneNumber;
    String address;
    String gender;
    boolean haveCovidcert;
    String education;
    int clientCount;
    TrainType trainType;

    public Trainer() {
    }

    public Trainer(String firstName, String lastName, int phoneNumber, String address, String gender, boolean haveCovidcert, String education, int clientCount, TrainType trainType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.haveCovidcert = haveCovidcert;
        this.education = education;
        this.clientCount = clientCount;
        this.trainType = trainType;
    }

    public Trainer(String firstName, String lastName, int phoneNumber, String address, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
    }
}
