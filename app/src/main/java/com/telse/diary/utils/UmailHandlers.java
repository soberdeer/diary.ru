package com.telse.diary.utils;

public enum UmailHandlers {
    HANDLE_OPEN_FOLDER(301),
    HANDLE_OPEN_MAIL(302),
    HANDLE_DELETE_UMAILS(303),
    HANDLE_PRELOAD_UMAIL(304);

    private int value;

    private UmailHandlers(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
