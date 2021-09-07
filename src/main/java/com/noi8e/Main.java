package com.noi8e;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Создание залов в фитнес-клубе
        TrainArea fightArea = new TrainArea("Зал Единоборств", true, true, TrainType.FIGHT.name());
        TrainArea yogaArea = new TrainArea();
        //Создадим тренеров
        Trainer roman = new Trainer("Roman", "Boxov", "79087898766", "someAddress", GenderType.MAN, fightArea);
        Trainer svetlana = new Trainer("Светлана", "Йоговна", "79081233221", "Адрес Светланы", GenderType.WOMAN, yogaArea);
        Trainer goga = new Trainer();
        //Создание клиентов
        Client client1 = new Client("Олег", "Олегов", GenderType.MAN, "79991237777", "Client1 Address", true, TrainType.FIGHT);
        Client client2 = new Client("Мария", "Марияновна", GenderType.WOMAN, "79991237777", "Client2 Address", false, TrainType.YOGA);
        Client client3 = new Client("Джон", "Джонов", GenderType.MAN, "79991237777", "Client3 Address", false, TrainType.GYM);
        Client client4 = new Client("Доу", "Апач", GenderType.HELICOPTER, "79085675454", "Hangars", false, TrainType.FIGHT);
        Client client5 = new Client("Лаган", "Тварочски", GenderType.NONBINAR, "79085673454", "Hangars Hangars", false, TrainType.FIGHT);
        //Создаем массивчик с клиентами
        Client[] arrClient = new Client[5];
        arrClient[0] = client1;
        arrClient[1] = client2;
        arrClient[2] = client3;
        arrClient[3] = client4;
        arrClient[4] = client5;
        List<Client> clientList = new ArrayList<Client>(Arrays.asList(arrClient));


        Staff jojo = new Staff("jojo", "lolo", GenderType.HELICOPTER.name(), "890876312", "JOjo-address");
        //Создание тренировок
        Train boxing = new Train(fightArea, TrainType.FIGHT, roman, true, true, jojo, 3, clientList);
        Train someTrain = new Train();


        System.out.println("------СТАРТ ПРОГРАММЫ-------");

        System.out.println("В нашем клубе " + Client.getCount() + " клиентов\n");
        System.out.println("Cводная информация о них: \n");
        for (Client client : clientList) {
            System.out.println(client.getSummaryInfo());
        };

        System.out.println("На тренировку по боксу у " + roman.getFullName() + " придут только " + boxing.howManyBoxers() + " клиентов");
        System.out.println("------КОНЕЦ ПРОГРАММЫ-------");

    }
}
