package com.zh.dao;

import com.zh.pojo.Matter;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("matterDao")
public class MatterDaoImpl extends HibernateDaoSupport implements MatterDao{
    @Resource
    private SessionFactory sessionFactory;

    @Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }
    @Override
    public List<Matter> findAllMatter() {
        String hql = "from com.zh.pojo.Matter";
        Query query = sessionFactory.openSession().createQuery(hql);
        return query.list();
    }
}
