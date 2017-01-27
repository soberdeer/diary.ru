package com.telse.diary.utils;


public enum ImgurConstants {
    IMGUR_CLIENT_AUTH("Client-ID 860dc14aa7caf25"),
    IMGUR_API_ENDPOINT("https://api.imgur.com/3/");

    private String value;

    private ImgurConstants(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
