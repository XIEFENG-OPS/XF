package com.xf.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xf.dao.UserMapper;
import com.xf.pojo.User;
import com.xf.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	@Override
	public List<User> queryUserList() {
		// TODO Auto-generated method stub
		return userMapper.queryUserList();
	}

}
