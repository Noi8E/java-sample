package com.noi8e;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Train {
    private UUID id;
    private String trainName;
    private TrainArea trainArea;
    private TrainType trainType;
    private Trainer trainer;
    private Client client;
    private boolean isGroupTrain;
    private boolean needClearAfterTrain;
    private Staff staff;
    private int maxPeopleValue;
    private static int currentPeopleCount = 0;
    List<Client> clientLinkedList;

    public List<Client> getClientLinkedList() {
        return clientLinkedList;
    }

    public void setClientLinkedList(List<Client> clientLinkedList) {
        this.clientLinkedList = clientLinkedList;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public UUID getId() {
        return id;
    }

    public TrainArea getTrainArea() {
        return trainArea;
    }

    public void setTrainArea(TrainArea trainArea) {
        this.trainArea = trainArea;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public boolean isGroupTrain() {
        return isGroupTrain;
    }

    public void setGroupTrain(boolean groupTrain) {
        isGroupTrain = groupTrain;
    }

    public boolean isNeedClearAfterTrain() {
        return needClearAfterTrain;
    }

    public void setNeedClearAfterTrain(boolean needClearAfterTrain) {
        this.needClearAfterTrain = needClearAfterTrain;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }


    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getMaxPeopleValue() {
        return maxPeopleValue;
    }

    public void setMaxPeopleValue(int maxPeopleValue) {
        this.maxPeopleValue = maxPeopleValue;
    }

    public static int getCurrentPeopleCount() {
        return currentPeopleCount;
    }

    public static void setCurrentPeopleCount(int currentPeopleCount) {
        Train.currentPeopleCount = currentPeopleCount;
    }

    public Train() {
        this.id = UUID.randomUUID();
    }


    //Если надо чистить ринг после тренировки
    public Train(TrainArea trainArea, TrainType trainType, Trainer trainer, boolean isGroupTrain, boolean needClearAfterTrain, Staff staff, int maxPeopleValue, List<Client> clientLinkedList) {
        this.id = UUID.randomUUID();
        this.trainArea = trainArea;
        this.trainType = trainType;
        this.trainer = trainer;
        this.isGroupTrain = isGroupTrain;
        this.maxPeopleValue = maxPeopleValue;
        this.needClearAfterTrain = needClearAfterTrain;
        this.staff = staff;
        this.clientLinkedList = clientLinkedList;

    }

    //Если не надо убирать после тренировки
    public Train(TrainArea trainArea, TrainType trainType, Trainer trainer, boolean isGroupTrain, boolean needClearAfterTrain, int maxPeopleValue,List<Client> clientLinkedList) {
        this.id = UUID.randomUUID();
        this.trainArea = trainArea;
        this.trainType = trainType;
        this.trainer = trainer;
        this.isGroupTrain = isGroupTrain;
        this.maxPeopleValue = maxPeopleValue;
        this.needClearAfterTrain = needClearAfterTrain;
        this.clientLinkedList = clientLinkedList;
    }
    public int howManyBoxers(){
        int i = 0;
        for (Client client: clientLinkedList) {
            if (trainType == client.clientTrainType) {
                i++;
            }
        }
        return i;
    }



}
