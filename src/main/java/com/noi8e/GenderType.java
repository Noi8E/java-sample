package com.noi8e;

public enum GenderType {
    MAN("Мужчина"),
    WOMAN("Женщина"),
    NONBINAR("Небинарное"),
    HELICOPTER("Боевой вертолет");

    String sex;

    GenderType() {
    }
    GenderType(String sex) {
        this.sex = sex;
    }
};
