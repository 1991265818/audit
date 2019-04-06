package com.zh.dao;

import com.zh.pojo.Information;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("inforDao")
public class InformationDaoImpl extends HibernateDaoSupport implements InformationDao{


    @Resource
    private SessionFactory sessionFactory;

    @Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }
    @Override
    public List<Information> findInformation() {
        String hql = "from com.zh.pojo.Information";
        Query query = sessionFactory.openSession().createQuery(hql);
        return query.list();
    }

    @Override
    public List<Information> queryInformation(String query) {
        String hql = "from com.zh.pojo.Information  where content like '%"+query+"%'";
        Query query1 = sessionFactory.openSession().createQuery(hql);
        return query1.list();
    }
}
