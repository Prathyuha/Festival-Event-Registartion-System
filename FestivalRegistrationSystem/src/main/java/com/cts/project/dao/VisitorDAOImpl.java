package com.cts.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.project.entity.Visitor;

@Repository
public class VisitorDAOImpl implements VisitorDAO{

	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}


	@Override
	public void saveVisitor(Visitor visitor) {

		System.out.println("dao method");
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(visitor);
	}

	@Override
	public void addvisitor(Visitor v) {
		Session session=this.sessionFactory.getCurrentSession();
		session.persist(v);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Visitor> listVisitors() {
		Session session=this.sessionFactory.getCurrentSession();
		List<Visitor> visitorList=session.createQuery("from Visitor").list();
		for(Visitor v:visitorList) {
		}
		return visitorList;
	}
	@Override
	public Visitor getVisitorById(int id) {
		Session session=this.sessionFactory.getCurrentSession();
		Visitor v=(Visitor) session.load(Visitor.class, new Integer(id));
		return v;
	}


	@Override
	public void updateVisitor(Visitor v) {
		Session session=this.sessionFactory.getCurrentSession();
		session.update(v);
	}


	@Override
	public void removeVisitor(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Visitor v = (Visitor) session.load(Visitor.class, new Integer(id));
		if(null != v){
			session.delete(v);
		}

	}



}



