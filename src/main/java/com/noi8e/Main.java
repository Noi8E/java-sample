package com.noi8e;


public class Main {

    public static void main(String[] args) {

        TrainArea fightArea = new TrainArea("Зал Единоборств", true, true, TrainType.FIGHT.name());
        Trainer roman = new Trainer("Roman", "Boxov", "79087898766", "someAddress", GenderType.MAN.name(), fightArea);
        Customers customer1 = new Customers("Олег", "Олегов", GenderType.MAN, "79991237777", "Client Address", true);
        Staff jojo = new Staff("jojo", "lolo", GenderType.HELICOPTER.name(), "890876312", "JOjo-address");
        Train boxingGroupTrain = new Train(fightArea, TrainType.FIGHT, roman, true, 2, true, jojo);
        boxingGroupTrain.setTrainName("Групповая тренировка по боксу");

        System.out.println(customer1.clientStringInfo(customer1));


        System.out.println(boxingGroupTrain.getTrainName());
        boxingGroupTrain.startTheTrain();

    }
}
