package com.noi8e;

public class Customers {
    String firstName;
    String lastName;
    String gender;
    int phoneNumber;
    String address;
    boolean isRussiaCitizen;
    boolean isNewbie;
    int heightCm;
    int weightKg;
    boolean isReactivationClient;
    boolean isPromoClient;

    public Customers() {
    }

    public Customers(String firstName, String lastName, String gender, int phoneNumber, String address, boolean isRussiaCitizen) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isRussiaCitizen = isRussiaCitizen;
    }

    public Customers(String firstName, String lastName, String gender, int phoneNumber, String address, boolean isRussiaCitizen, boolean isNewbie, int heightCm, int weightKg, boolean isReactivationClient, boolean isPromoClient) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isRussiaCitizen = isRussiaCitizen;
        this.isNewbie = isNewbie;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
        this.isReactivationClient = isReactivationClient;
        this.isPromoClient = isPromoClient;
    }
}
