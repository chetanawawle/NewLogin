package com.univ.controller.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univ.controller.entities.StaffLoginPOJO;
import com.univ.controller.repository.StaffLoginRepository;


	@Service
	public class StaffLoginService implements StaffLoginServiceImple{
	@Autowired
	private StaffLoginRepository repo;
	
	@Override
	public List <StaffLoginPOJO> getAllLoginPOJO(){
		   
		   return repo.findAll();
	   }
	}
	 /* public LoginPOJO login(String password, String role ) {
	  LoginPOJO user = repo.findByPasswordAndrole(password,role);
	   return user;
	  }
	}*/
	 