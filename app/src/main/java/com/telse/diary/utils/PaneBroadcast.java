package com.telse.diary.utils;


public enum PaneBroadcast {
    CLOSING("CLOSING_PANE"), OPENING("OPENING_PANE");

    private String value;

    private PaneBroadcast(String value){
        this.value = value;
    }

    public String value() {
        return value;
    }
}
