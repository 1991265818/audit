package com.zh.service;

import com.zh.pojo.Backlogs;

import java.util.List;

public interface BacklogsService {
    public List<Backlogs> findBacklogs();

    public int updateBlacklogsById(Backlogs backlogs);

    public List<Backlogs> findBacklogsByType(int typeid);

    public List<Backlogs> findDoBacklogs();
}
