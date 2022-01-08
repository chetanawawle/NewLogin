package com.univ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univ.controller.entities.StaffLoginPOJO;
import com.univ.controller.repository.StaffLoginRepository;
import com.univ.controller.service.StaffLoginService;

@RestController
@RequestMapping("/univ")
public class StaffLoginController {
	
	
	@Autowired
	public StaffLoginRepository staffRepository;
	
	/*
	 * @GetMapping(path="/display") public String display() { return "hello"; }
	 */
	
	//display all staff records
	@GetMapping("/getallstaff")
	public List<StaffLoginPOJO> getAllStaff(){
		return staffRepository.findAll();
	}
	
	/*
	 * //save staff record
	 * 
	 * @PostMapping(path="/savestaff",consumes="application/json") public Staff
	 * createStaff(@Valid @RequestBody StaffLoginPOJO staff) { return
	 * staffLoginRepository.save(staff);
	 */
    }
