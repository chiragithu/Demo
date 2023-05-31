package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Usser;
@Repository
public interface userRepo extends JpaRepository<Usser,Integer> {
	
	@Query(value="Select * from User where username=:user and password=:pas",nativeQuery=true )
	public Usser login(String user,String pas);

}
