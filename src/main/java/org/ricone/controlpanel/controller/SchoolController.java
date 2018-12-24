package org.ricone.controlpanel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SchoolController {

	@GetMapping("/schools")
	private String schools() {
		return "schools";
	}

	@GetMapping("/schools/{id}")
	private String school(@PathVariable String id) {
		return "school";
	}
}