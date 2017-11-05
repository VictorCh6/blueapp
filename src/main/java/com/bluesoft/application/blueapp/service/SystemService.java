package com.bluesoft.application.blueapp.service;

import java.util.List;

import com.bluesoft.application.blueapp.model.SystemModel;

public interface SystemService {
	
	public void addSystem(SystemModel systemModel);
	
	public List<SystemModel> getAllSystems();
	
	public void updateSystem(SystemModel systemModel);
	
	public void deleteSystem(SystemModel systemModel);
}
