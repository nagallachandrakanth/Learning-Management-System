package com.te.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.lms.entity.Request;

public interface RequestRepository extends JpaRepository<Request, Integer> {

}
