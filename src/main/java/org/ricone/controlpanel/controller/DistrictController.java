package org.ricone.controlpanel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DistrictController {

	@GetMapping("/districts")
	private String districts() {
		return "districts";
	}

	@GetMapping("/districts/{id}")
	private String district(@PathVariable String id) {
		return "district";
	}
}