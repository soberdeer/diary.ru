package com.telse.diary;


import java.io.Serializable;
import java.util.HashMap;


public class DiaryUser implements Serializable {
    private int diaryUser;
    private String username;
    private int journalType;
    private String avatar;
    private String birthday;
    private HashMap<Integer, String> favs;
    private HashMap<Integer, String> readers;


    public DiaryUser(){}

    public int getDiaryUser() {
        return diaryUser;
    }

    public String getUsername() {
        return username;
    }

    public int getJournalType() {
        return journalType;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getBirthday() {
        return birthday;
    }

    public HashMap<Integer, String> getFavs() {
        return favs;
    }

    public HashMap<Integer, String> getReaders() {
        return readers;
    }


    public void setDiaryUser(int diaryUser) {
        this.diaryUser = diaryUser;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setJournalType(int journalType) {
        this.journalType = journalType;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setFavs(HashMap<Integer, String> favs) {
        this.favs = favs;
    }

    public void setReaders(HashMap<Integer, String> readers) {
        this.readers = readers;
    }
}
