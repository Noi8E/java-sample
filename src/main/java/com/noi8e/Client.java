package com.noi8e;

import java.util.UUID;

public class Client {
    private UUID id;
    private String firstName;
    private String lastName;
    private GenderType gender;
    private String phoneNumber;
    private boolean isRussiaCitizen;
    private String address;
    TrainType clientTrainType;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Client.count = count;
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

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isRussiaCitizen() {
        return isRussiaCitizen;
    }

    public void setRussiaCitizen(boolean russiaCitizen) {
        isRussiaCitizen = russiaCitizen;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TrainType getClientTrainType() {
        return clientTrainType;
    }

    public void setClientTrainType(TrainType clientTrainType) {
        this.clientTrainType = clientTrainType;
    }

    public Client(TrainType trainType) {
        this.id = UUID.randomUUID();
        this.clientTrainType = getClientTrainType();
        count++;
    }

    public Client() {
        this.id = UUID.randomUUID();
        count++;
    }

    public Client(String firstName, String lastName, GenderType gender, String phoneNumber, String address, boolean isRussiaCitizen, TrainType clientTrainType) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isRussiaCitizen = isRussiaCitizen;
        this.clientTrainType = clientTrainType;
        count++;
    }

    public String getSummaryInfo(){
        return "Имя: " + firstName + ". Фамилия: " + lastName + ". Телефон: " + phoneNumber + ". Пол: " + gender + ". Id клиента: " + id + ".";
    }


}
