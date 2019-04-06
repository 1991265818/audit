package com.zh.dao;

import com.zh.pojo.Backlogs;

import java.util.List;

public interface BacklosDao {
    //获取未审核的事项
    public List<Backlogs> findBacklogs();

    //通过ID对事项进行审核
    public int updateBlacklogsById(Backlogs backlogs);

    //获取相应类型且未审核的事项
    public List<Backlogs> findBacklogsByType(int typeid);

    //获取已审核的事项
    public List<Backlogs> findDoBacklogs();
}
