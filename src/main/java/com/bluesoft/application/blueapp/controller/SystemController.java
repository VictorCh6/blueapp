package com.bluesoft.application.blueapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bluesoft.application.blueapp.model.SystemModel;
import com.bluesoft.application.blueapp.service.SystemService;
/**
 * @author Victor Chukwu
 *
 */
@Controller
public class SystemController {

	@Autowired
	SystemService systemService;

	@GetMapping("/addSystem")
	public String systemForm(Model model) {
		model.addAttribute("system", new SystemModel());
		return "addSystem";
	}

	@PostMapping("addSystem")
	public String addSystem(@ModelAttribute("system")@Valid SystemModel systemModel, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "addSystem";
		}
		systemService.addSystem(systemModel);
		return "success";
	}

	@GetMapping("/systems")
	public String allSystems(Model model) {
		model.addAttribute("systems", systemService.getAllSystems());
		return "systems";
	}

	@GetMapping("/updateSystem-{name}")
	public String updateSystem(Model model, @PathVariable String name) {
		SystemModel systemModel = systemService.getSystemByName(name);
		model.addAttribute("system", systemModel);
		return "updateSystem";
	}

	@PostMapping("/updateSystem-{name}")
	public String updateSystem(@ModelAttribute("system")@Valid SystemModel systemModel, BindingResult result, Model model, @PathVariable String name) {
		if (result.hasErrors()) {
			return "updateSystem";
		}
		systemService.updateSystem(systemModel);
		return "success";
	}

	@GetMapping("/deleteSystem-{name}")
	public String deleteSystemForm(@PathVariable String name) {
		systemService.deleteSystem(name);
		return "redirect:/systems";
	}
}