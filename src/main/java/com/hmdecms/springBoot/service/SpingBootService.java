package com.hmdecms.springBoot.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmdecms.springBoot.responsity.DemoResponsity;

@Service
public class SpingBootService {

	@Resource
	private DemoResponsity demoResponsity;
	
	public String Demo1dayService(){
		return demoResponsity.Demo1dayTest1();
	}
}
