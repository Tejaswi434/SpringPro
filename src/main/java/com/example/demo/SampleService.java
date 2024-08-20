package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service 


public class SampleService {
	@Autowired
	 JdbcTemplate jd;
   
	public List<Map<String,Object>> productdetails(){
		
 		String str="select * from Products";
		
         return jd.queryForList(str);
		
	}
	
}
