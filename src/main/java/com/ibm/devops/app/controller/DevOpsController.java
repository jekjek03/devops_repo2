package com.ibm.devops.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ibm.devops.app.service.DevOpsService;

@Controller
public class DevOpsController {

	@Autowired
	private DevOpsService devOpsService;
	
	/**
	 * Loads the home page to browser
	 * @return String
	 */
	@GetMapping("/home")
	public String homePage() {
		return devOpsService.getJspName();
	}
	
}
