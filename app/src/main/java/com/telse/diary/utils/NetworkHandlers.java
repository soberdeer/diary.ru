package com.telse.diary.utils;


public enum NetworkHandlers {
    HANDLE_START(401),
    HANDLE_SERVICE_UPDATE(402),
    HANDLE_PROGRESS(403),
    HANDLE_PROGRESS_2(404),
    HANDLE_CONNECTIVITY_ERROR(405),
    HANDLE_SERVICE_ERROR(406),
    HANDLE_NOTFOUND_ERROR(407),
    HACKING_CLOUDFLARE(408),
    HANDLE_STEP_SEQUENCE(409);
    
    private int value;
    private NetworkHandlers(int value){
        this.value = value;
    }

    public int value() {
        return value;
    }
}
