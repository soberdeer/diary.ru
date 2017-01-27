package com.telse.diary.utils;

public enum LinksConstants {
    MAIN_PAGE("http://www.diary.ru"),
    LOGIN_PAGE("http://www.diary.ru/login.php"),
    REGISTER_PAGE("http://www.diary.ru/registration/"),
    DISCUSSIONS_PAGE("http://www.diary.ru/discussion/"),
    FAVORITES_PAGE("http://www.diary.ru/list/?act=show&fgroup_id=0"),
    SUBSCRIBERS_PAGE("http://www.diary.ru/list/?act=show&fgroup_id=-1");

    private String link;

    private LinksConstants(String link) {
        this.link = link;
    }

    public String link() {
        return link;
    }
}
