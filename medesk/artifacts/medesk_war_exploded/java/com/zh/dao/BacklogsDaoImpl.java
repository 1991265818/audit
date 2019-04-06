package com.zh.dao;

import com.zh.pojo.Backlogs;
import com.zh.pojo.Operation;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;
@Repository("backlogsDao")
public class BacklogsDaoImpl extends HibernateDaoSupport implements  BacklosDao{

    @Resource
    private SessionFactory sessionFactory;

    @Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }

    public List<Backlogs> findBacklogsByType(int typeid){
        String hql = "from com.zh.pojo.Backlogs where typeid=? and operationId=3";
        Query query = sessionFactory.openSession().createQuery(hql);
        query.setInteger(0,typeid);
        return query.list();
    }

    @Override
    public List<Backlogs> findDoBacklogs() {
        String hql = "from com.zh.pojo.Backlogs where operationId !=3";
        Query query = sessionFactory.openSession().createQuery(hql);
        return query.list();
    }

    public List<Backlogs> findBacklogs(){
        String hql = "from com.zh.pojo.Backlogs where operationId=3";
        Query query = sessionFactory.openSession().createQuery(hql);
        return query.list();
    }

    @Override
    public int updateBlacklogsById(Backlogs backlogs) {
        String hql = "update com.zh.pojo.Backlogs  set suggestion=?,dopeople = ?,dotime=?,operationId=? where blid= ?";
        Query query = sessionFactory.openSession().createQuery(hql);
        query.setString(0,backlogs.getSuggestion());
        query.setString(1,backlogs.getDopeople());
        query.setParameter(2,backlogs.getDotime());
        query.setInteger(3,backlogs.getOperationId());
        query.setInteger(4,backlogs.getBlid());
        int ret=query.executeUpdate();
        return ret;
    }
}
