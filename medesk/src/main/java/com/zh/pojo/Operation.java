package com.zh.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Operation {
    private int operationid;
    private String operation;

    @Id
    @Column(name = "operationid")
    public int getOperationid() {
        return operationid;
    }

    public void setOperationid(int operationid) {
        this.operationid = operationid;
    }

    @Basic
    @Column(name = "operation")
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operation operation1 = (Operation) o;

        if (operationid != operation1.operationid) return false;
        if (operation != null ? !operation.equals(operation1.operation) : operation1.operation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = operationid;
        result = 31 * result + (operation != null ? operation.hashCode() : 0);
        return result;
    }
}
