package com.zh.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Backlogs {
    private int blid;
    private String despatcher;
    private Timestamp sendtime;
    private String dotime;
    private String suggestion;
    private String dopeople;
    private int operationId;
    private Operation operation;
    private Matter matter;

    public Matter getMatter() {
        return matter;
    }

    public void setMatter(Matter matter) {
        this.matter = matter;
    }

    @Basic
    @Column(name = "operationId")
    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }



    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    @Id
    @Column(name = "blid")
    public int getBlid() {
        return blid;
    }

    public void setBlid(int blid) {
        this.blid = blid;
    }
    @Basic
    @Column(name = "despatcher")
    public String getDespatcher() {
        return despatcher;
    }

    public void setDespatcher(String despatcher) {
        this.despatcher = despatcher;
    }

    @Basic
    @Column(name = "sendtime")
    public Timestamp getSendtime() {
        return sendtime;
    }

    public void setSendtime(Timestamp sendtime) {
        this.sendtime = sendtime;
    }

    @Basic
    @Column(name = "dotime")
    public String getDotime() {
        return dotime;
    }

    public void setDotime(String dotime) {
        this.dotime = dotime;
    }

    @Basic
    @Column(name = "suggestion")
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Basic
    @Column(name = "dopeople")
    public String getDopeople() {
        return dopeople;
    }

    public void setDopeople(String dopeople) {
        this.dopeople = dopeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Backlogs backlogs = (Backlogs) o;

        if (blid != backlogs.blid) return false;
        if (despatcher != null ? !despatcher.equals(backlogs.despatcher) : backlogs.despatcher != null) return false;
        if (sendtime != null ? !sendtime.equals(backlogs.sendtime) : backlogs.sendtime != null) return false;
        if (suggestion != null ? !suggestion.equals(backlogs.suggestion) : backlogs.suggestion != null) return false;
        if (dopeople != null ? !dopeople.equals(backlogs.dopeople) : backlogs.dopeople != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = blid;
        result = 31 * result + (despatcher != null ? despatcher.hashCode() : 0);
        result = 31 * result + (sendtime != null ? sendtime.hashCode() : 0);
        result = 31 * result + (suggestion != null ? suggestion.hashCode() : 0);
        result = 31 * result + (dopeople != null ? dopeople.hashCode() : 0);
        return result;
    }
}
