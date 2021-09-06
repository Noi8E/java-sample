package com.noi8e;

public class Staff {
    private String firstName;
    private String lastName;
    private String gender;
    private int phoneNumber;
    private String address;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isRussiaCitizen() {
        return isRussiaCitizen;
    }

    public void setRussiaCitizen(boolean russiaCitizen) {
        isRussiaCitizen = russiaCitizen;
    }

    public boolean isHaveCovidCert() {
        return haveCovidCert;
    }

    public void setHaveCovidCert(boolean haveCovidCert) {
        this.haveCovidCert = haveCovidCert;
    }

    boolean isRussiaCitizen;
    boolean haveCovidCert;

    public Staff() {
    }

    public Staff(String firstName, String lastName, String gender, int phoneNumber, String address, boolean isRussiaCitizen, boolean haveCovidCert) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isRussiaCitizen = isRussiaCitizen;
        this.haveCovidCert = haveCovidCert;
    }
}
