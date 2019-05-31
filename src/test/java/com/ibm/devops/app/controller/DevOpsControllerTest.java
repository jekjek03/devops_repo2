package com.ibm.devops.app.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ibm.devops.app.service.DevOpsService;

@RunWith(SpringRunner.class)
@WebMvcTest(DevOpsController.class)
public class DevOpsControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private DevOpsService service;
	
	@Test
	public void methodShouldReturnJspNameFromService() throws Exception {
		 when(service.getJspName()).thenReturn("home");
	     this.mockMvc.perform(get("/home"))
	     			 .andDo(print())
	     			 .andExpect(status().isOk())
	                 //.andExpect(content().string(containsString("Welcome to PixoGram!")))
	                 ;
	}
	
}
