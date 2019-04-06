package com.zh.service;

import com.zh.dao.BacklosDao;
import com.zh.pojo.Backlogs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("backlogService")
public class BacklogsServiceImpl  implements BacklogsService{

   @Autowired
   @Qualifier("backlogsDao")
    private BacklosDao backlosDao;


    public List<Backlogs> findBacklogs(){
        return backlosDao.findBacklogs();
    }

    @Override
    public int updateBlacklogsById(Backlogs backlogs) {
        return backlosDao.updateBlacklogsById(backlogs);
    }

    @Override
    public List<Backlogs> findBacklogsByType(int typeid) {
        return backlosDao.findBacklogsByType(typeid);
    }

    @Override
    public List<Backlogs> findDoBacklogs() {
        return backlosDao.findDoBacklogs();
    }
}
