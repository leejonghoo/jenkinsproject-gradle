package com.care.jenkinsproject.repository;

import java.util.ArrayList;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.care.jenkinsproject.dto.JenkinsDTO;

@Repository
@Mapper
public interface JenkinsRepo {

	@Results( {
			@Result(property = "id", column = "id"),
			@Result(property = "pw", column = "pw"),
			@Result(property = "fullName", column = "full_name"),
			@Result(property = "addr", column = "addr"),
			@Result(property = "tel", column = "tel")
	})
	@Select("SELECT * FROM member")
	public ArrayList<JenkinsDTO> members();
	
	@Insert("INSERT INTO member VALUES(#{id}, #{pw}, #{fullName}, #{addr}, #{tel})")
	public int register(JenkinsDTO member);
	
	//	중복체크 
	@Select("SELECT count(*) FROM member WHERE id=#{id}")
	public int isExist(String id);
	
	@Results( {
			@Result(property = "id", column = "id"),
			@Result(property = "pw", column = "pw"),
			@Result(property = "fullName", column = "full_name"),
			@Result(property = "addr", column = "addr"),
			@Result(property = "tel", column = "tel")
	})
	@Select("SELECT * FROM member WHERE id=#{id}")
	public JenkinsDTO login(String id);
}
