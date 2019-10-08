package com.neuedu.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.bean.UserInfo;
import com.neuedu.model.mapper.UserInfoMapper;

@Service
public class UserInfoService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	public List<UserInfo> selectUser(){
		return userInfoMapper.selectUsers();
	} 
}
