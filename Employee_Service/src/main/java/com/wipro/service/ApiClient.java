package com.wipro.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wipro.dto.DepartmentDto;

@FeignClient(name="DEPARTMENT-CAPSTONE")
public interface ApiClient {

	@GetMapping("/departments/code/{departmentCode}")
	public DepartmentDto getDepartmentByCode(@PathVariable("departmentCode") String deptDto);
	
}