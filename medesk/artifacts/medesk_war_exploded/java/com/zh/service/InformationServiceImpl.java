package com.zh.service;

import com.zh.dao.InformationDao;
import com.zh.pojo.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("inforService")
public class InformationServiceImpl implements InformationService {
    @Autowired
    @Qualifier("inforDao")
    private InformationDao informationDao;
    @Override
    public List<Information> findInformation() {
        return informationDao.findInformation();
    }

    @Override
    public List<Information> queryInformation(String query) {
        return informationDao.queryInformation(query);
    }
}
