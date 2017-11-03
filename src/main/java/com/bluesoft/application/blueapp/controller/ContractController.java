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

import com.bluesoft.application.blueapp.model.Contract;
import com.bluesoft.application.blueapp.service.ContractService;

@Controller
public class ContractController {

	@Autowired
	private ContractService contractService;
	
	@GetMapping("/addContract")
	public String contractForm(Locale locale, Model model) {
		model.addAttribute("contract", new Contract());
		return "addContract";
	}
	
	@PostMapping("addContract")
	public String addContract(@ModelAttribute("contract") @Valid Contract contract, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("contracts", contractService.getAllContracts());
			return "contracts";
		}
		contractService.addContract(contract);
		return "success";
	}
	
	@GetMapping("/")
	public String list(Locale locale, Model model) {
		model.addAttribute("contracts", contractService.getAllContracts());
		return "contracts";
	}
	
	@GetMapping("/updateContract")
	public String updateForm(Locale locale, Model model) {
		model.addAttribute("contract", new Contract());
		return "updateContract";
	}
	
	@PostMapping("updateContract")
	public String updateContract(@ModelAttribute("contract") @Valid Contract contract, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("contracts", contractService.getAllContracts());
			return "contracts";
		}
		contractService.updateContract(contract);
		return "success";
	}
	
	@GetMapping("/deactivateContract")
	public String deactivatetForm(Locale locale, Model model) {
		model.addAttribute("contract", new Contract());
		return "deactivateContract";
	}
	
	@PostMapping("deactivateContract")
	public String deactivateContract(@ModelAttribute("contract") @Valid Contract contract, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("contracts", contractService.getAllContracts());
			return "contracts";
		}
		contractService.deactivateContract(contract);
		return "success";
	}
}
