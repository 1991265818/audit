package com.zh.service;

import com.zh.pojo.Information;

import java.util.List;

public interface InformationService {
    public List<Information> findInformation();

    public List<Information> queryInformation(String query);
}
