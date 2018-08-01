package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.domain.UserMapper;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	public UserMapper userMapper;

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

}
