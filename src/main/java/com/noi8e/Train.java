package com.noi8e;

import java.util.UUID;

public class Train {
    private UUID id;
    private String trainName;
    private int currentPeopleValue;
    private TrainArea trainArea;
    private TrainType trainType;
    private Trainer trainer;
    private boolean isGroupTrain;
    private boolean needClearAfterTrain;
    private Staff staff;

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

    public int getCurrentPeopleValue() {
        return currentPeopleValue;
    }
    public void setCurrentPeopleValue(int currentPeopleValue) {

        this.currentPeopleValue = currentPeopleValue;
    }


    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Train() {
        this.id = UUID.randomUUID();
    }
    public Train(int currentPeopleValue) {
        this.id = UUID.randomUUID();
        this.currentPeopleValue = currentPeopleValue;
    }
    //Если надо чистить ринг после тренировки
    public Train(TrainArea trainArea, TrainType trainType, Trainer trainer, boolean isGroupTrain, int currentPeopleValue, boolean needClearAfterTrain, Staff staff) {
        this.id = UUID.randomUUID();
        this.trainArea = trainArea;
        this.trainType = trainType;
        this.trainer = trainer;
        this.isGroupTrain = isGroupTrain;
        this.currentPeopleValue = currentPeopleValue;
        this.needClearAfterTrain = needClearAfterTrain;
        this.staff = staff;
    }
    //Если не надо убирать после тренировки
    public Train(TrainArea trainArea, TrainType trainType, Trainer trainer, boolean isGroupTrain, int currentPeopleValue, boolean needClearAfterTrain) {
        this.id = UUID.randomUUID();
        this.trainArea = trainArea;
        this.trainType = trainType;
        this.trainer = trainer;
        this.isGroupTrain = isGroupTrain;
        this.currentPeopleValue = currentPeopleValue;
        this.needClearAfterTrain = needClearAfterTrain;
    }

    public void startTheTrain() {
        if (trainer.getId() != null && trainArea.getId() != null) {
            if (this.currentPeopleValue <= 3) {
                System.out.println("Можем начинать тренировку!!!\n\n");
                System.out.println("Тренер: " + trainer.getFullName());
                System.out.println("Зал: " + trainArea.getAreaName());
                System.out.println("Кол-во клиентов: " + this.currentPeopleValue);
            }
            else System.out.println("На тренировке слишком много людей");
        }
        else System.out.println("Нет тренера или зала");

    }

}
