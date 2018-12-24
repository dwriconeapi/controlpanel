package org.ricone.controlpanel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VendorController {

	@GetMapping("/vendors")
	private String vendors() {
		return "vendors";
	}

	@GetMapping("/vendors/{id}")
	private String vendor(@PathVariable String id) {
		return "vendor";
	}
}