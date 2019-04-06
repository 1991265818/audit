package com.zh.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Matter {
    private int typeid;
    private String matter;

    @Id
    @Column(name = "typeid")
    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    @Basic
    @Column(name = "matter")
    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matter matter1 = (Matter) o;

        if (typeid != matter1.typeid) return false;
        if (matter != null ? !matter.equals(matter1.matter) : matter1.matter != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeid;
        result = 31 * result + (matter != null ? matter.hashCode() : 0);
        return result;
    }
}
