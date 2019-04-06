package com.zh.service;

import com.zh.dao.OperationDao;
import com.zh.pojo.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("operationService")
public class OperationServiceImpl implements OperationService{
    @Autowired
    @Qualifier("operationDao")
    private OperationDao operationDao;
    @Override
    public List<Operation> findAllOperantion() {
        return operationDao.findAllOperantion();
    }
}
