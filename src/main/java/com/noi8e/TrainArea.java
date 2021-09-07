package com.noi8e;

import java.util.UUID;

public class TrainArea {
    private UUID id;
    private String areaName;
    private boolean needAKey;
    private boolean isForGroupProgram;
    private String trainType;




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

    public TrainArea() {
        this.id = UUID.randomUUID();
    }

    public TrainArea(String areaName, boolean needAKey, boolean isForGroupProgram, String trainType) {
        this.id = UUID.randomUUID();
        this.areaName = areaName;
        this.needAKey = needAKey;
        this.isForGroupProgram = isForGroupProgram;
        this.trainType = trainType;
    }
}
