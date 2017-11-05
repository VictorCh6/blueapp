package com.bluesoft.application.blueapp.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bluesoft.application.blueapp.model.SystemModel;
import com.bluesoft.application.blueapp.service.SystemService;

@Controller
public class SystemController {

	@Autowired
	SystemService systemService;
	
	@GetMapping("/addSystem")
	public String systemForm(Locale locale, Model model) {
		model.addAttribute("system", new SystemModel());
		return "addSystem";
	}
	
	@PostMapping("addSystem")
	public String addSystem(@ModelAttribute("system") @Valid SystemModel systemModel, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("systems", systemService.getAllSystems());
			return "systems";
		}
		systemService.addSystem(systemModel);
		return "success";
	}
	
	@GetMapping("/systems")
	public String allSystems(Locale locale, Model model) {
		model.addAttribute("systems", systemService.getAllSystems());
		return "systems";
	}
	
	@GetMapping("/updateSystem")
	public String updateSystem(Locale locale, Model model) {
		model.addAttribute("system", new SystemModel());
		return "updateSystem";
	}
	
	@PostMapping("/updateSystem")
	public String updateSystem(@ModelAttribute("system") @Valid SystemModel systemModel, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "systems";
		}
		systemService.updateSystem(systemModel);
		return "success";
	}
	
	@GetMapping("/deleteSystem")
	public String deleteSystemForm(Locale locale, Model model) {
		//SystemModel systemModel = new SystemModel();
		model.addAttribute("system", new SystemModel());
		return "deleteSystem";
	}
	
	@PostMapping("/deleteSystem")
	public String deleteSystem(@ModelAttribute("system") SystemModel systemModel) {
		systemService.deleteSystem(systemModel.getName());
		return "success";
	}
}
