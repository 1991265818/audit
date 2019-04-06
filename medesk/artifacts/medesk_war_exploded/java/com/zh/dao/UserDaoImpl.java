package com.zh.dao;

import com.zh.pojo.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

    @Resource
    private SessionFactory sessionFactory;

    @Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }

    @Override
    public User login(String userid, String password) {
        String hql = "from com.zh.pojo.User where userid=? and password = ?";
        Query query = sessionFactory.openSession().createQuery(hql);
        query.setString(0,userid);
        query.setString(1,password);
        return (User) query.uniqueResult();
    }
}
