package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {

    private String month;

    String color() {
        return "red";
    }

    int getSpeed() {

        return 10;
    }

    public void setMigrationMonth(String month) {
        this.month = month;
    }

    public String getMigrationMonth() {
        return month;
    }
}
