package com.te.lms.service;

import java.util.Optional;

import com.te.lms.dto.RegistrationDto;
import com.te.lms.entity.Employee;

public interface EmsService {

	Employee registrationEmployee(RegistrationDto registrationDto);

	//Optional<Employee> getData(Integer employeeId);

}
