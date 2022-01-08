package com.univ.controller.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.univ.controller.entities.StaffLoginPOJO;

@Service
public interface StaffLoginServiceImple
{
 
	public List<StaffLoginPOJO> getAllLoginPOJO();
}
