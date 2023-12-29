package com.project.service;

import com.project.entity.Users;
import com.sun.xml.internal.fastinfoset.util.StringArray;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class UpdateUser {
    @Autowired
    SessionFactory sessionFactory;
    public Boolean updateUser(Users users){
        Session session =sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(users);
        transaction.commit();
        return true;
    }

}
