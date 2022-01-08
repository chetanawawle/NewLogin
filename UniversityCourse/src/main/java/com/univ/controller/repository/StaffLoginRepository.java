package com.univ.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univ.controller.entities.StaffLoginPOJO;


@Repository
public interface StaffLoginRepository extends JpaRepository<StaffLoginPOJO, String>{
	//StaffLoginPOJO findByPasswordAndrole(String password, String role);

}
