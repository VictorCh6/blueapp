package com.bluesoft.application.blueapp.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bluesoft.application.blueapp.model.SystemModel;
/**
 * @author Victor Chukwu
 *
 */
@Repository
public class SystemDaoImpl implements SystemDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addSystem(SystemModel systemModel) {
		sessionFactory.getCurrentSession().persist(systemModel);
	}

	@Override
	public List < SystemModel > getAllSystems() {@SuppressWarnings("unchecked")
		TypedQuery < SystemModel > query = sessionFactory.getCurrentSession().createQuery("from SystemModel");
		return query.getResultList();
	}

	@Override
	public void updateSystem(SystemModel systemModel) {
		sessionFactory.getCurrentSession().update(systemModel);
	}

	@Override
	public void deleteSystem(String name) {
		SystemModel systemModel = getSystemByName(name);
		sessionFactory.getCurrentSession().delete(systemModel);
	}

	@Override
	public SystemModel getSystemByName(String name) {
		SystemModel systemModel = sessionFactory.getCurrentSession().get(SystemModel.class, name);
		return systemModel;
	}
}