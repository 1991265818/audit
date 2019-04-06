package com.zh.dao;

import com.zh.pojo.Backlogs;
import com.zh.pojo.Operation;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository("operationDao")
public class OperationDaoImpl extends HibernateDaoSupport implements OperationDao {
    @Resource
    private SessionFactory sessionFactory;

    @Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }
    @Override
    public List<Operation> findAllOperantion() {
        String hql = "from com.zh.pojo.Operation";
        Query query = sessionFactory.openSession().createQuery(hql);
        return query.list();
    }

}
