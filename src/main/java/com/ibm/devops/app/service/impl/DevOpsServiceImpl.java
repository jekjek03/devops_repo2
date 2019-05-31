package com.ibm.devops.app.service.impl;

import org.springframework.stereotype.Service;

import com.ibm.devops.app.service.DevOpsService;

@Service
public class DevOpsServiceImpl implements DevOpsService {

	@Override
	public String getJspName() {
		return "home";
	}

}
