package com.lyquyduong.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lyquyduong.model.UserDTO;
@Repository
public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;
	
	@Override
	public UserDTO getByUsername(String user) {
		Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from UserDTO where username = ?");
        q.setString(0, user);
        q.setMaxResults(1);
        UserDTO u;
        List lu = q.list();
        if(lu.size() > 0) u = (UserDTO) lu.get(0);
        else u = new UserDTO();
        tx.commit();
        session.close();
        return u;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	
}
