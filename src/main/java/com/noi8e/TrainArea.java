package com.noi8e;

import java.util.UUID;

public class TrainArea {
    private UUID id;
    private String areaName;
    private boolean needAKey;
    private boolean isForGroupProgram;
    private String trainType;
    private int maxPeopleValue;


    public UUID getId() {
        return id;
    }


    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public boolean isNeedAKey() {
        return needAKey;
    }

    public void setNeedAKey(boolean needAKey) {
        this.needAKey = needAKey;
    }

    public boolean isForGroupProgram() {
        return isForGroupProgram;
    }

    public void setForGroupProgram(boolean forGroupProgram) {
        isForGroupProgram = forGroupProgram;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public int getMaxPeopleValue() {
        return maxPeopleValue;
    }

    public void setMaxPeopleValue(int maxPeopleValue) {
        this.maxPeopleValue = maxPeopleValue;
    }
    //Конструкторы

    public TrainArea()
    {
        this.id = UUID.randomUUID();
        this.maxPeopleValue = 1;
    }

    public TrainArea(String areaName, boolean needAKey, boolean isForGroupProgram, String trainType) {
        this.id = UUID.randomUUID();
        this.areaName = areaName;
        this.needAKey = needAKey;
        this.isForGroupProgram = isForGroupProgram;
        this.trainType = trainType;
    }
}
