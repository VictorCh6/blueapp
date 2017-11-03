package com.bluesoft.application.blueapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bluesoft.application.blueapp.dao.ContractDao;
import com.bluesoft.application.blueapp.model.Contract;

@Service
public class ContractServiceImpl implements ContractService {
	
	@Autowired
	ContractDao contractDao;

	@Transactional
	public void addContract(Contract contract) {
		contractDao.addContract(contract);
	}

	@Transactional(readOnly = true)
	public List<Contract> getAllContracts() {
		return contractDao.getAllContracts();
	}

	@Transactional
	public void updateContract(Contract contract) {
		contractDao.updateContract(contract);
	}

	@Transactional
	public void deactivateContract(Contract contract) {
		contractDao.deactivateContract(contract);
	}
}
