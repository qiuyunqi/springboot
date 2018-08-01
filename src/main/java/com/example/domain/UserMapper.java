package com.example.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	@Select("select * from users")
	@Results({ 
		@Result(property = "id", column = "id"),
		@Result(property = "nickName", column = "nick_name"),
		@Result(property = "ip", column = "ip"),
		@Result(property = "createTime", column = "create_time")
		})
	List<User> findAll();
}
