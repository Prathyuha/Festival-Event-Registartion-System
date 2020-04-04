package com.cts.project.dao;

import java.util.List;

import com.cts.project.entity.Visitor;
public interface VisitorDAO {

	public void saveVisitor(Visitor visitor);
	public void addvisitor(Visitor v);
	public void updateVisitor(Visitor v);
	public List<Visitor> listVisitors();	
	public Visitor getVisitorById(int id);
	public void removeVisitor(int id);
}
