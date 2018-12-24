package org.ricone.controlpanel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	private String index() {
		return "index";
	}


	/*@GetMapping("/other")
	public String otherPage(Model model) {
		model.addAttribute("data", StudentUtils.buildStudents());
		return "other.html";
	}*/
}