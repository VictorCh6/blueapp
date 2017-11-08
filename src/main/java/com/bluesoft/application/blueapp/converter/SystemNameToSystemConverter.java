package com.bluesoft.application.blueapp.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.bluesoft.application.blueapp.model.SystemModel;
import com.bluesoft.application.blueapp.service.SystemService;
/**
 * @author Victor Chukwu
 *
 */
@Component
public class SystemNameToSystemConverter implements Converter < Object,
SystemModel > {

	@Autowired
	SystemService systemService;

	@Override
	public SystemModel convert(Object source) {
		SystemModel systemModel = systemService.getSystemByName((String) source);
		return systemModel;
	}

}