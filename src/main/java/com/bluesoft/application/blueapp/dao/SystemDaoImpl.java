package com.bluesoft.application.blueapp.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bluesoft.application.blueapp.model.SystemModel;

@Repository
public class SystemDaoImpl implements SystemDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addSystem(SystemModel systemModel) {
		sessionFactory.getCurrentSession().save(systemModel);
	}

	@Override
	public List<SystemModel> getAllSystems() {
		@SuppressWarnings("unchecked")
		TypedQuery<SystemModel> query = sessionFactory.getCurrentSession().createQuery("from SystemModel");
		return query.getResultList();
	}

	@Override
	public void updateSystem(SystemModel systemModel) {
		sessionFactory.getCurrentSession().update(systemModel);
	}

	@Override
	public void deleteSystem(String name) {
		sessionFactory.getCurrentSession().delete(name);
	}
}
