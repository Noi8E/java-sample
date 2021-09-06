package com.noi8e;

public class Area {
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
        this.areaName = areaName;
        this.length = length;
        this.width = width;
        this.isForGroupProgram = isForGroupProgram;
        this.trainType = trainType;
    }
}
