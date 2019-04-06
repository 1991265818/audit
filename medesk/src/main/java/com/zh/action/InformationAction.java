package com.zh.action;

import com.zh.service.InformationService;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Map;

public class InformationAction implements RequestAware{

    private String query;
    private Map<String, Object> request;
    @Autowired
    @Qualifier("inforService")
    private InformationService informationService;

    public String infor() {
        request.put("inforList",informationService.findInformation() );
        return "infor";
    }
    public String query() {
        request.put("inforList",informationService.queryInformation(query));
        return "infor";
    }
    public void setQuery(String query) {
        this.query = query;
    }
    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }
}
