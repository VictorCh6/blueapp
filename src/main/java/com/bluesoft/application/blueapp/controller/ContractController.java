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

import com.bluesoft.application.blueapp.model.Contract;
import com.bluesoft.application.blueapp.service.ContractService;
import com.bluesoft.application.blueapp.service.SystemService;
/**
 * @author Victor Chukwu
 *
 */
@Controller
public class ContractController {

	@Autowired
	private ContractService contractService;

	@Autowired
	private SystemService systemService;

	@GetMapping("/addContract")
	public String contractForm(Model model) {
		model.addAttribute("systems", systemService.getAllSystems());
		model.addAttribute("contract", new Contract());
		return "addContract";
	}

	@PostMapping("addContract")
	public String addContract(@ModelAttribute("contract")@Valid Contract contract, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "addContract";
		}
		contractService.addContract(contract);
		return "success";
	}

	@GetMapping("/")
	public String list(Model model) {
		model.addAttribute("contracts", contractService.getAllContracts());
		return "contracts";
	}

	@GetMapping("/activeContracts")
	public String activeContractList(Model model) {
		model.addAttribute("contracts", contractService.getAllActiveContracts());
		return "contracts";
	}

	@GetMapping("/updateContract-{number}")
	public String updateForm(Model model, @PathVariable String number) {
		Contract contract = contractService.getContractByNumber(number);
		model.addAttribute("contract", contract);
		return "updateContract";
	}

	@PostMapping("updateContract-{number}")
	public String updateContract(@ModelAttribute("contract")@Valid Contract contract, BindingResult result, Model model, @PathVariable String number) {
		if (result.hasErrors()) {
			return "updateContract";
		}
		contractService.updateContract(contract);
		return "success";
	}

	@GetMapping("/deactivateContract-{number}")
	public String deactivatetForm(Model model, @PathVariable String number) {
		Contract contract = contractService.getContractByNumber(number);
		model.addAttribute("contract", contract);
		return "deactivateContract";
	}

	@PostMapping("deactivateContract-{number}")
	public String deactivateContract(@ModelAttribute("contract")@Valid Contract contract, BindingResult result, Model model, @PathVariable String number) {
		if (result.hasErrors()) {
			model.addAttribute("contracts", contractService.getAllContracts());
			return "deactivateContract";
		}
		contractService.deactivateContract(contract);
		return "success";
	}
}