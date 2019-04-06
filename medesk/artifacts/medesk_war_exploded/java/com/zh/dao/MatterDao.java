package com.zh.dao;

import com.zh.pojo.Matter;

import java.util.List;

public interface MatterDao {
    //获取事项类型表
    public List<Matter> findAllMatter();
}
