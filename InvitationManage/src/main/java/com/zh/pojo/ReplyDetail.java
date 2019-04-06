package com.zh.pojo;

import java.sql.Date;

public class ReplyDetail {
    private int id;
    private int ivnId;//帖子表的主键
    private String content;//内容
    private String author;//昵称
    private Date createDate; //时间

    public ReplyDetail() {
    }

    public ReplyDetail(int id, int ivnId, String content, String author, Date createDate) {
        this.id = id;
        this.ivnId = ivnId;
        this.content = content;
        this.author = author;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIvnId() {
        return ivnId;
    }

    public void setIvnId(int ivnId) {
        this.ivnId = ivnId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
