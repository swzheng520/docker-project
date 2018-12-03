package com.zzw.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	@Value("${cust.name}")
	private String custName;

	@PostMapping(value = "/getCustName")
	public String getCustName() {
		return custName;
	}
}
