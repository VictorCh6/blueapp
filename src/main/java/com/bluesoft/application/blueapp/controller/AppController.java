package com.bluesoft.application.blueapp.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author Victor Chukwu
 *
 */
@Controller
public class AppController {

	LocalDate date;

	@RequestMapping("/about")
	public String about(Model model) {

		model.addAttribute("author", "Victor Chukwu");
		model.addAttribute("date", date = LocalDate.of(2017, 11, 6));
		model.addAttribute("greeting", "Serdecznie pozdrawiam");
		return "about";
	}
}