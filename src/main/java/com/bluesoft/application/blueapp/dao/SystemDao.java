package com.bluesoft.application.blueapp.dao;

import java.util.List;

import com.bluesoft.application.blueapp.model.SystemModel;

public interface SystemDao {
	
	public SystemModel getSystemByName(String name);

	public void addSystem(SystemModel systemModel);
	
	public List<SystemModel> getAllSystems();
	
	public void updateSystem(SystemModel systemModel);
	
	public void deleteSystem(String name);
}
