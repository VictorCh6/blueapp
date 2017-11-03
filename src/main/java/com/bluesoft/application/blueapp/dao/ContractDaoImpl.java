package com.bluesoft.application.blueapp.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bluesoft.application.blueapp.model.Contract;

@Repository
public class ContractDaoImpl implements ContractDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addContract(Contract contract) {
		sessionFactory.getCurrentSession().save(contract);
	}

	public List<Contract> getAllContracts() {
		@SuppressWarnings("unchecked")
		TypedQuery<Contract> query = sessionFactory.getCurrentSession().createQuery("from Contract");
		return query.getResultList();
	}

	public void updateContract(Contract contract) {
		sessionFactory.getCurrentSession().update(contract);
	}

	public void deactivateContract(Contract contract) {
		sessionFactory.getCurrentSession().update(contract);
	}
}
