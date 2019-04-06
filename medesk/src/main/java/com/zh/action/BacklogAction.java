package com.zh.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ModelDriven;
import com.zh.pojo.Backlogs;
import com.zh.pojo.Matter;
import com.zh.pojo.Operation;
import com.zh.service.BacklogsService;
import com.zh.service.InformationService;
import com.zh.service.MatterService;
import com.zh.service.OperationService;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Map;

public class BacklogAction implements RequestAware, ServletResponseAware, ModelDriven<Backlogs> {

    private int typeid;
    private Backlogs backlogs;
    private Map<String, Object> request;
    private javax.servlet.http.HttpServletResponse response;
    @Autowired
    @Qualifier("backlogService")
    private BacklogsService backlogsService;
    @Autowired
    @Qualifier("matterService")
    private MatterService matterService;
    @Autowired
    @Qualifier("operationService")
    private OperationService operationService;
    @Autowired
    @Qualifier("gson")
    private Gson gson;

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String backlogs() {
        request.put("backlogsEntities", backlogsService.findBacklogs());
        request.put("matters", matterService.findAllMatter());
        return "backlogs";
    }
    public String doBacklogs() {
        request.put("backlogsEntities", backlogsService.findDoBacklogs());
        return "doBacklogs";
    }
    public  String matter(){
        request.put("matters", matterService.findAllMatter());
        request.put("backlogsEntities", backlogsService.findBacklogsByType(typeid));
        return "backlogs";
    }
    public String update() throws IOException {
        if (backlogsService.updateBlacklogsById(backlogs) > 0) {

        } else {
        }
        request.put("backlogsEntities", backlogsService.findBacklogs());
        request.put("matters", matterService.findAllMatter());
        return "backlogs";
    }

    public void operations() throws IOException {
        PrintWriter out = response.getWriter();
        String data = gson.toJson(operationService.findAllOperantion());
        out.write(data);
        out.flush();
        out.close();
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.response = httpServletResponse;
    }

    @Override
    public Backlogs getModel() {
        this.backlogs = new Backlogs();
        return backlogs;
    }
}
