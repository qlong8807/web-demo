package com.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.bean.User;
import com.demo.dao.UserMapper;
import com.demo.service.UserService;



@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper mapper;

	public boolean delete(int id) {
		
		return mapper.delete(id);
	}

	public List<User> findAll() {
		List<User> findAllList = mapper.findAll();
		return findAllList;
	}

	public User findById(int id) {

		User user = mapper.findById(id);
		
		return user;
	}

	public void save(User user) {
		mapper.save(user);
	}

	public boolean update(User user) {

		return mapper.update(user);
	}
	
	

}
