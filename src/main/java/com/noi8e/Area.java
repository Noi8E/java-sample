package com.noi8e;

import java.util.UUID;

public class Area {
    private UUID id;
    String areaName;
    int length;
    int width;
    int maxClientValue;
    byte window;
    boolean needAKey;
    boolean isForGroupProgram;
    TrainType trainType;

    public Area() {
    }

    public Area(String areaName, int length, int width, boolean isForGroupProgram, TrainType trainType) {
        this.id = UUID.randomUUID();
        this.areaName = areaName;
        this.length = length;
        this.width = width;
        this.isForGroupProgram = isForGroupProgram;
        this.trainType = trainType;
    }
}
