package com.noi8e;


public class Main {

    public static void main(String[] args) {
        TrainArea fightArea = new TrainArea();
        Trainer roman = new Trainer("Roman", "QA", "79087898766", "someAddress", GenderType.MAN.name(), fightArea);
        Trainer sveta = new Trainer();
        TrainArea gymArea = new TrainArea("Зона свободных весов", false, true, TrainType.GYMAREA.name());

        Staff jojo = new Staff("jojo", "petrob", GenderType.HELICOPTER.name(), "890876312", "JOjo-address");
        Staff tutti = new Staff();


        System.out.println("roman " + roman.getId());
        System.out.println("roman " + roman.getTrainArea().getId());
        System.out.println("sveta " + sveta.getId());
    }
}
