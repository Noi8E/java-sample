package com.noi8e;

public class Trainer {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String address;
    private String gender;
    private boolean haveCovidcert;
    private String education;
    private int clientCount;
    private TrainType trainType;

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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHaveCovidcert() {
        return haveCovidcert;
    }

    public void setHaveCovidcert(boolean haveCovidcert) {
        this.haveCovidcert = haveCovidcert;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getClientCount() {
        return clientCount;
    }

    public void setClientCount(int clientCount) {
        this.clientCount = clientCount;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

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
