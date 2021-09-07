package com.noi8e;

import java.util.UUID;

public class Customers {
    private UUID id;
    private String firstName;
    private String lastName;
    private GenderType gender;
    private String phoneNumber;
    private boolean isRussiaCitizen;
    private boolean isNewbie;
    private int heightCm;
    private int weightKg;
    private boolean isReactivationClient;
    private boolean isPromoClient;
    private String address;

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

    public boolean isNewbie() {
        return isNewbie;
    }

    public void setNewbie(boolean newbie) {
        isNewbie = newbie;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }

    public boolean isReactivationClient() {
        return isReactivationClient;
    }

    public void setReactivationClient(boolean reactivationClient) {
        isReactivationClient = reactivationClient;
    }

    public boolean isPromoClient() {
        return isPromoClient;
    }

    public void setPromoClient(boolean promoClient) {
        isPromoClient = promoClient;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customers() {
    }

    public Customers(String firstName, String lastName, GenderType gender, String phoneNumber, String address, boolean isRussiaCitizen) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isRussiaCitizen = isRussiaCitizen;
    }

    public Customers(String firstName, String lastName, GenderType gender, String phoneNumber, String address, boolean isRussiaCitizen, boolean isNewbie, int heightCm, int weightKg, boolean isReactivationClient, boolean isPromoClient) {
        this.id = UUID.randomUUID();
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
    public String clientStringInfo(Customers customer){
        String firstName = this.firstName;
        String lastName = this.lastName;
        String phone = this.phoneNumber;
        String gender;
        if (customer.gender == GenderType.MAN) {
            gender = "Мужчина";
        }
        else if (customer.gender == GenderType.WOMAN) {
            gender = "Женщина";
        }
        else if (customer.gender == GenderType.NONBINAR) {
            gender = "Небинарное";
        }
        else gender = "Боевой вертолет";
        return firstName + " " + lastName + " " + phone + " " + gender;
    }


}
