package com.cts.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.project.dao.VisitorDAO;
import com.cts.project.entity.Visitor;

@Service
public class VisitorServiceImpl implements VisitorService {
	
	@Autowired
	private VisitorDAO dao;
	@Override
	@Transactional
	public void saveVisitor(Visitor visitor) {
		
		dao.saveVisitor(visitor);

	}
	@Override
	public void addvisitor(Visitor v) {
		this.dao.addvisitor(v);
	}
	@Override
	public void updateVisitor(Visitor v) {
		this.dao.updateVisitor(v);
		
	}
	@Override
	public List<Visitor> listVisitors() {
		// TODO Auto-generated method stub
		return this.dao.listVisitors();
	}
	@Override
	public Visitor getVisitorById(int id) {
		// TODO Auto-generated method stub
		return this.dao.getVisitorById(id);
	}
	@Override
	public void removeVisitor(int id) {
		this.dao.removeVisitor(id);
		
	}


}
