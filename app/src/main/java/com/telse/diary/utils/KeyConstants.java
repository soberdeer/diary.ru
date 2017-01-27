package com.telse.diary.utils;

public enum KeyConstants {
    KEY_USERNAME("diary.username.key"),
    KEY_PASSWORD("diary.password.key"),
    KEY_KEEP_AUTH("diary.keep.auth"),
    KEY_USERPASS_CACHE("diary.password.cache"),
    PREFERENCE("diary.shared.prefs");

    private String key;

    private KeyConstants(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }
}
