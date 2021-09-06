package com.noi8e;

public class Main {
    public static void main(String[] args) {
        Trainer roman = new Trainer("Petr","Petr","79101232322","Lenin st, d. 11, h. 55",
                GenderType.NonBinar.name(),true,"FIZO-VUZ",20,TrainType.gymArea);

        System.out.println(roman.getAddress());
        System.out.println(roman.getClientCount());
        System.out.println(roman.getPhoneNumber());
    }

}
