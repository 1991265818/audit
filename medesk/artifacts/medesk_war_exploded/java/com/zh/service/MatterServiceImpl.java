package com.zh.service;

import com.zh.dao.MatterDao;
import com.zh.pojo.Matter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("matterService")
public class MatterServiceImpl implements MatterService {
    @Autowired
    @Qualifier("matterDao")
    private MatterDao matterDao;
    @Override
    public List<Matter> findAllMatter() {
        return matterDao.findAllMatter();
    }
}
