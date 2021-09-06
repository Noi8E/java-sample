package com.noi8e;


public class Main {

    public static void main(String[] args) {
        Trainer roman = new Trainer("Roman","QA","79087898766","someAddress",GenderType.MAN.name());
        Trainer sveta = new Trainer();

        TrainArea area = new TrainArea("Железки",false,true,TrainType.GYMAREA.name());
        TrainArea area1 = new TrainArea();

        Staff jojo = new Staff("jojo","petrob",GenderType.HELICOPTER.name(),"890876312","JOjo-address");
        Staff tutti = new Staff();


        System.out.println("roman " + roman.getId());
        System.out.println("sveta " + sveta.getId());

        System.out.println("area " + area.getId());
        System.out.println("area1 " + area1.getId());

        System.out.println("jojo " + jojo.getId());
        System.out.println("tutti " + tutti.getId());
    }

}
