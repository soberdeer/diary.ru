package com.telse.diary;


import java.io.Serializable;
import java.util.Date;

public class DiaryItem implements Serializable{

    private int id;
    private String title;

    private String description;

    private String link;

    private Date pubDate;


    public DiaryItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getDate() {
        return pubDate;
    }

    public void setDate(Date pubDate) {
        this.pubDate = pubDate;
    }
}
