package com.zh.dao;

import com.zh.pojo.Backlogs;
import com.zh.pojo.Operation;

import java.util.List;

public interface OperationDao {
    //获取审核操作表
    public List<Operation> findAllOperantion();
}
