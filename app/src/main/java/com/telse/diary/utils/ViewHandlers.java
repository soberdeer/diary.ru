package com.telse.diary.utils;

enum ViewHandlers {
    HANDLE_IMAGE_CLICK(101),
    HANDLE_UPDATE_HEADERS(102),
    HANDLE_NAME_CLICK(103);

    private int value;

    private ViewHandlers(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
