package com.bluesoft.application.blueapp.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bluesoft.application.blueapp.model.Contract;
/**
 * @author Victor Chukwu
 *
 */
@Repository
public class ContractDaoImpl implements ContractDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addContract(Contract contract) {
		sessionFactory.getCurrentSession().save(contract);
	}

	@Override
	public List<Contract> getAllContracts() {
		@SuppressWarnings("unchecked")
		TypedQuery<Contract> query = sessionFactory.getCurrentSession().createQuery("from Contract");
		return query.getResultList();
	}

	@Override
	public void updateContract(Contract contract) {
		sessionFactory.getCurrentSession().update(contract);
	}

	@Override
	public void deactivateContract(Contract contract) {
		sessionFactory.getCurrentSession().setProperty("isActive", false);
	}

	@Override
	public List<Contract> getAllActiveContracts() {
		@SuppressWarnings("unchecked")
		TypedQuery<Contract> query = sessionFactory.getCurrentSession().createQuery("from Contract where isActive= 'true'");
		return query.getResultList();
	}

	@Override
	public Contract getContractByNumber(String number) {
		Contract contract = sessionFactory.getCurrentSession().get(Contract.class, number);
		return contract;
	}
}
