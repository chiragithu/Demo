package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.DashBoard;
import com.example.demo.entity.Logg;
import com.example.demo.entity.Usser;
import com.example.demo.repository.Dboard;
import com.example.demo.repository.userRepo;
import com.example.demo.service.userService;

@Controller
public class userRest {
	@Autowired
	private userRepo urepo;
	@Autowired
	private userService uservice;
	@Autowired
	private Dboard drepo;
	
	@GetMapping("/home")
	public String home(Model model) {
		System.out.ptintln("hi ");
		return "homepage";
	}
	@GetMapping("/get")
	public String  saveUr(Model model) {
		Usser ent=new Usser();
		model.addAttribute("usr", ent);
		
		return "registration";
		
	}
	@PostMapping("/done")
	public String Save(Usser ent) {
		urepo.save(ent);
		
		return "savemsg";
		
		
	}
	@GetMapping("/log")
	public String logIn(Model model) {
		Logg log=new Logg();
		model.addAttribute("admin",log);
		return "loginpage";
		
	}
	@PostMapping("/login")
	public String loggin(Logg log) {
		  String ss = uservice.loginCheck(log);
		 if(ss!=null) {
			 return "dashboard";
		 }
		 else {
			return  "invalid"; 
			
		 }
		 
		
	}
	 @PostMapping("/add")
	 public String taskSave(DashBoard dbd) {
		 drepo.save(dbd);
		 return "dashboard";
		 
		 
	 }
	 @GetMapping ("/tasks")
	 public String getall(Model model) {
		 DashBoard alltask = drepo.gets();
		 model.addAttribute("tasks",alltask);
		 return "dashboard";
		 
	 }
}
