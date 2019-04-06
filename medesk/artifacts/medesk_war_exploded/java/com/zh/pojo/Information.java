package com.zh.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Information {
    private int infoid;
    private int infotype;
    private String content;
    private String sendpeople;
    private Timestamp sendtime;

    @Id
    @Column(name = "infoid")
    public int getInfoid() {
        return infoid;
    }

    public void setInfoid(int infoid) {
        this.infoid = infoid;
    }

    @Basic
    @Column(name = "infotype")
    public int getInfotype() {
        return infotype;
    }

    public void setInfotype(int infotype) {
        this.infotype = infotype;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "sendpeople")
    public String getSendpeople() {
        return sendpeople;
    }

    public void setSendpeople(String sendpeople) {
        this.sendpeople = sendpeople;
    }

    @Basic
    @Column(name = "sendtime")
    public Timestamp getSendtime() {
        return sendtime;
    }

    public void setSendtime(Timestamp sendtime) {
        this.sendtime = sendtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Information that = (Information) o;

        if (infoid != that.infoid) return false;
        if (infotype != that.infotype) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (sendpeople != null ? !sendpeople.equals(that.sendpeople) : that.sendpeople != null) return false;
        if (sendtime != null ? !sendtime.equals(that.sendtime) : that.sendtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = infoid;
        result = 31 * result + infotype;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (sendpeople != null ? sendpeople.hashCode() : 0);
        result = 31 * result + (sendtime != null ? sendtime.hashCode() : 0);
        return result;
    }
}
