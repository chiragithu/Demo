package com.example.demo.entity;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="dashboard")
public class DashBoard {
	 @Id
	 @Column(name="Tid")
	private Integer Tid;
	
	@Column(name="Description")
	private String description;
	@Column(name="Attachment")
	private String attachment;
	@Column(name="AddAttachment")
	private File addAttachment;
	

}