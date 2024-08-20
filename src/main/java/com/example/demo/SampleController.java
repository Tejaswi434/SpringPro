package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class SampleController {
 @Autowired
     SampleService sampleservice;
	@GetMapping("/abcd")
	public List<Map<String,Object>> display()
	{
		return sampleservice.productdetails();
	}
}  


