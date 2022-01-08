package com.univ.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.univ.controller.entities.StaffLoginPOJO;
import com.univ.controller.repository.StaffLoginRepository;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;



@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@SpringBootTest
class UniversityCourseApplicationTests {
	
	 @Autowired
	    private TestEntityManager entityManager;
	     
	    @Autowired
	    private StaffLoginRepository repo;
		

	@Test
	void contextLoads() {
		 StaffLoginPOJO loginpojo = new StaffLoginPOJO();
		 loginpojo.setUsername("arul");
		 loginpojo.setPassword("bharath2020");
		 loginpojo.setRole("student");
		   
		     
		    StaffLoginPOJO savedUser = repo.save(loginpojo);
		     
		    StaffLoginPOJO existUser = entityManager.find(StaffLoginPOJO.class, savedUser.getUsername());
		     
		    assertThat(loginpojo.getPassword()).isEqualTo(existUser.getPassword());
		
		
	}

}
