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
public class AppController {

	@GetMapping("/apps")
	private String apps(ModelMap model) {

		App app = new App();
		app.setId("castleLearning1");
		app.setName("Castle Learning Online");
		app.setVendorId("castleSoftware");
		app.setStatus("Active");
		app.setPublic(true);

		App app2 = new App();
		app2.setId("castleLearning2");
		app2.setName("Castle Learning Online");
		app2.setVendorId("castleSoftware");
		app2.setStatus("Active");
		app2.setPublic(true);

		App app3 = new App();
		app3.setId("castleLearning3");
		app3.setName("Castle Learning Online");
		app3.setVendorId("castleSoftware");
		app3.setStatus("Active");
		app3.setPublic(true);

		App app4 = new App();
		app4.setId("castleLearning4");
		app4.setName("Castle Learning Online");
		app4.setVendorId("castleSoftware");
		app4.setStatus("Active");
		app4.setPublic(true);

		Apps apps = new Apps();
		apps.getApps().add(app);
		apps.getApps().add(app2);
		apps.getApps().add(app3);
		apps.getApps().add(app4);

		model.addAttribute("apps", apps.getApps());
		return "apps";
	}

	@GetMapping("/apps/{id}")
	private String app(ModelMap model, @PathVariable String id) {
		App app = new App();
		app.setId("castleLearning1");
		app.setName("Castle Learning Online");
		app.setVendorId("castleSoftware");
		app.setStatus("Active");
		app.setLongDescription("A lot of words go here. I mean a lot... like at least a hundred.");
		app.setIconUrl("http://www.ricone.org/wp-content/uploads/2016/01/castle_big.jpg");
		app.setPublic(true);

		Vendor vendor = new Vendor();
		vendor.setId("castleSoftware");
		vendor.setName("Castle Software");
		vendor.setWebsite("http://www.castlelearning.com/");

		List<District> districtList = new ArrayList<>();
		for(int i = 1; i < 6; i++) {
			District district = new District();
			district.setId("district"+ i);
			district.setName("District " + i);
			district.setStatus("Testing");
			if(getRandomNumberInRange(0,1) == 0) {
				district.setEnabled(false);
			}
			else {
				district.setEnabled(true);
			}

			districtList.add(district);
		}

		List<Contact> contactList = new ArrayList<>();
		for(int i = 1; i < 5; i++) {
			Contact contact = new Contact();
			contact.setId(i);
			contact.setName("Person Name");
			contact.setEmail("something@email.com");
			contact.setTitle("Programmer");
			contactList.add(contact);
		}

		model.addAttribute("app", app);
		model.addAttribute("vendor", vendor);
		model.addAttribute("districts", districtList);
		model.addAttribute("contacts", contactList);
		return "app";
	}

	@GetMapping("/apps/{appId}/district/{districtId}")
	private String districtByApp(ModelMap model, @PathVariable String appId, @PathVariable String districtId) {
		App app = new App();
		app.setId("castleLearning1");
		app.setName("Castle Learning Online");
		app.setVendorId("castleSoftware");
		app.setStatus("Active");
		app.setLongDescription("A lot of words go here. I mean a lot... like hundreds.");
		app.setIconUrl("http://www.ricone.org/wp-content/uploads/2016/01/castle_big.jpg");
		app.setPublic(true);

		Vendor vendor = new Vendor();
		vendor.setId("castleSoftware");
		vendor.setName("Castle Software");
		vendor.setWebsite("http://www.castlelearning.com/");


		District district = new District();
		district.setId("district"+ 1);
		district.setName("District " + 1);
		district.setStatus("Testing");

		district.setStreet("17 Harvard Street");
		district.setCity("Schenectady");
		district.setProvince("New York");
		district.setCounty("Schenectady");
		district.setPostcode("12304");
		district.setOfficePhone("(518) 810-3880");
		if(getRandomNumberInRange(0,1) == 0) {
			district.setEnabled(false);
		}
		else {
			district.setEnabled(true);
		}

		List<Contact> contactList = new ArrayList<>();
		for(int i = 1; i < 5; i++) {
			Contact contact = new Contact();
			contact.setId(i);
			contact.setName("Person Name");
			contact.setEmail("something@email.com");
			contact.setTitle("Programmer");
			contactList.add(contact);
		}

		List<School> schoolList = new ArrayList<>();
		for(int i = 1; i < 5; i++) {
			School school = new School();
			school.setId("school"+i);
			school.setLocName("School " + i);
			school.setStateLocId(StringUtils.randomAlphanumeric(5));
			if(getRandomNumberInRange(0,1) == 0) {
				school.setEnabled(false);
			}
			else {
				school.setEnabled(true);
			}
			schoolList.add(school);
		}

		List<DistrictKV> auppKVList = new ArrayList<>();
		for(int i = 1; i < 5; i++) {
			DistrictKV districtKV = new DistrictKV();
			districtKV.setField("aupp.username.field.thing." + i);
			districtKV.setValue("a value goes here");
			auppKVList.add(districtKV);
		}



		model.addAttribute("app", app);
		model.addAttribute("vendor", vendor);
		model.addAttribute("district", district);
		model.addAttribute("contacts", contactList);
		model.addAttribute("schools", schoolList);
		model.addAttribute("auppKVs", auppKVList);
		return "districtByApp";
	}

	@GetMapping("/apps/{appId}/district/{districtId}/school/{schoolId}")
	private String schoolByDistrictByApp(ModelMap model, @PathVariable String appId, @PathVariable String districtId, @PathVariable String schoolId) {
		App app = new App();
		app.setId("castleLearning1");
		app.setName("Castle Learning Online");
		app.setVendorId("castleSoftware");
		app.setStatus("Active");
		app.setLongDescription("A lot of words go here. I mean a lot... like hundreds.");
		app.setIconUrl("http://www.ricone.org/wp-content/uploads/2016/01/castle_big.jpg");
		app.setPublic(true);

		District district = new District();
		district.setId("district"+ 1);
		district.setName("District " + 1);
		district.setStatus("Testing");

		district.setStreet("17 Harvard Street");
		district.setCity("Schenectady");
		district.setProvince("New York");
		district.setCounty("Schenectady");
		district.setPostcode("12304");
		district.setOfficePhone("(518) 810-3880");
		if(getRandomNumberInRange(0,1) == 0) {
			district.setEnabled(false);
		}
		else {
			district.setEnabled(true);
		}

		School school = new School();
		school.setId("school");
		school.setLocName("School ");
		school.setStateLocId(StringUtils.randomAlphanumeric(5));
		if(getRandomNumberInRange(0,1) == 0) {
			school.setEnabled(false);
		}
		else {
			school.setEnabled(true);
		}

		List<SchoolKV> auppKVList = new ArrayList<>();
		for(int i = 1; i < 15; i++) {
			SchoolKV schoolKV = new SchoolKV();
			schoolKV.setField("aupp.username.field.thing." + i);
			schoolKV.setValue("a value goes here");
			auppKVList.add(schoolKV);
		}

		model.addAttribute("app", app);
		model.addAttribute("district", district);
		model.addAttribute("school", school);
		model.addAttribute("auppKVs", auppKVList);
		return "schoolByDistrictByApp";
	}

	@GetMapping("/apps/create")
	private String create() {
		return "appCreate";
	}

	private static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}