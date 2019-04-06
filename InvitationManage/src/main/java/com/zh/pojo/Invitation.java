package com.zh.pojo;


import java.sql.Date;

public class Invitation {
    private int id;
    private String title;//标题
    private String summary;//摘要
    private String author;//作者
    private Date createDate; //时间

    public Invitation() {
    }

    public Invitation(int id, String title, String summary, String author, Date createDate) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.author = author;
        this.createDate = createDate;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
