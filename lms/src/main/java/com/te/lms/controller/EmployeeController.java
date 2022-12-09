package com.te.lms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.lms.dto.RegistrationDto;
import com.te.lms.entity.Employee;
import com.te.lms.response.ApiResponse;
import com.te.lms.service.EmsService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api")
public class EmployeeController {
	private final EmsService emsService;

	@PostMapping(path = "/registration/employee")
	public ApiResponse<String> registration(@RequestBody RegistrationDto registrationDto) {
		Employee employee = emsService.registrationEmployee(registrationDto);
		if (employee != null) {
			return new ApiResponse<String>("Registration successfull",null,employee.getEmployeeName());
		}
		throw new RuntimeException("Registration unsuccessfull");
	}

	/*
	 * @GetMapping(path = "/getdata/{empId}") public Optional<Employee>
	 * getData(@PathVariable("empId") Integer employeeId) { return
	 * emsService.getData(employeeId); }
	 */

}
