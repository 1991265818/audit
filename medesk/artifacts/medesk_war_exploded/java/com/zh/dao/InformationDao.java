package com.zh.dao;

import com.zh.pojo.Information;

import java.util.List;

public interface InformationDao {
    //查询所有消息
    public List<Information> findInformation();
    //查询与内容相近的消息
    public List<Information> queryInformation(String query);
}
