package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.DashBoard;

public interface Dboard  extends JpaRepository<DashBoard,Serializable>{
	@Query(value="select * from dashboard",nativeQuery=true)
	public DashBoard gets();

}
