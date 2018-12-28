package org.ricone.controlpanel.controller;

import org.ricone.config.response.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Controller
public class ProviderController {

	@GetMapping("/providers")
	private String providers(ModelMap model) {

		List<Provider> list = new ArrayList<>();
		for(int i = 1; i < 6; i++) {
			Provider provider = new Provider();
			provider.setId("provider"+i);
			provider.setName("Provider " +i);
			provider.setHref("https://" + provider.getId() + ".ricone.org");
			list.add(provider);
		}

		model.addAttribute("providers", list);
		return "providers";
	}

	private static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}