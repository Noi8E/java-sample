package com.noi8e;

public enum TrainType {
    FIGHT("Единоборства"),
    GYM("Зона свободных весов"),
    DANCE("Танцевальная студия"),
    YOGA("Йога");
    String type;

    TrainType() {
    }

    TrainType(String type) {
        this.type = type;
    }
};
