package com.git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/demoController")
public class ControllerDemo {
	@ResponseBody
	@ApiOperation(value = "query api basic information",notes="this is notes")
	@RequestMapping("get")
	public String get(@RequestParam("id") String id){
		return "success"+id;
	}
}
