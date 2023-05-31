package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Usser")

public class Usser {
	@Id
	@Column(name="ID")
	private Integer id;
	@Column(name="NAME")
	private String name;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="EMAIL")
	private String email;
	@Column(name="DOB")
	private Date dob;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	

}
