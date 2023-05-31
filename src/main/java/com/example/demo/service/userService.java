package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Logg;
import com.example.demo.entity.Usser;
import com.example.demo.repository.Dboard;
import com.example.demo.repository.userRepo;

@Service
public class userService {
	@Autowired
	private userRepo urepo;
	@Autowired
	private Dboard drepo;
	public String loginCheck(Logg l) {
		String pwd=l.getPassword();
		String usr=l.getUsername();
		Usser state = urepo.login(usr,pwd);
		if(state.getId()!=null) {
			
			return null;
			
		}
		else {
			return "invalid creadentials";
		}
	}
	

}
