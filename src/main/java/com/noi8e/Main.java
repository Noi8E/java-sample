package com.noi8e;


public class Main {

    public static void main(String[] args) {

        TrainArea fightArea = new TrainArea();
        Trainer roman = new Trainer("Roman", "Boxov", "79087898766", "someAddress", GenderType.MAN.name(), fightArea);
        Customers customer1 = new Customers("Олег","Олегов",GenderType.MAN,)
        Staff jojo = new Staff("jojo", "lolo", GenderType.HELICOPTER.name(), "890876312", "JOjo-address");
        Train boxingGroupTrain = new Train(fightArea,TrainType.FIGHT,roman,true,4,true,jojo);

        boxingGroupTrain.setTrainName("Групповая тренировка по боксу");
        boxingGroupTrain.startTheTrain();

    }
}
