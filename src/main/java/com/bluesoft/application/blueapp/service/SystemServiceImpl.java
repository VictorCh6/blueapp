package com.bluesoft.application.blueapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bluesoft.application.blueapp.dao.SystemDao;
import com.bluesoft.application.blueapp.model.SystemModel;
/**
 * @author Victor Chukwu
 *
 */
@Service
public class SystemServiceImpl implements SystemService {
	
	@Autowired
	SystemDao systemDao;

	@Transactional
	public void addSystem(SystemModel systemModel) {
		systemDao.addSystem(systemModel);
	}

	@Transactional
	public List<SystemModel> getAllSystems() {
		return systemDao.getAllSystems();
	}

	@Transactional
	public void updateSystem(SystemModel systemModel) {
		systemDao.updateSystem(systemModel);
	}

	@Transactional
	public void deleteSystem(String name) {
		systemDao.deleteSystem(name);
	}

	@Transactional
	public SystemModel getSystemByName(String name) {
		return systemDao.getSystemByName(name);
	}
}
