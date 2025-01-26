package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.StudentOrder;

public interface StudentOrderRepo extends JpaRepository<StudentOrder, Integer> {
	
	public StudentOrder findByRazorpayOrderId(String orderId);

}
