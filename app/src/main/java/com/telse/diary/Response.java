package com.telse.diary;


import java.util.List;

public class Response {

    private Channel channel;

    private String login;


    public Channel getChannel() {
        return channel;
    }

    public String getLogin() {
        return login;
    }


    public static class Channel {

        private List<DiaryItem> items;

        public List<DiaryItem> getItems() {
            return items;
        }

    }
}
